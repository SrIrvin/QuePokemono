package com.example.quepokemono.service;

import com.example.quepokemono.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Optional;

/**
 * Service class for interacting with the Pokémon API.
 * <p>
 * This service communicates with the external Pokémon API to retrieve Pokémon data by name.
 * It uses {@link RestTemplate} to make HTTP GET requests to the API and maps the response to a {@link Pokemon} object.
 * </p>
 */
@Service
public class PokeApiService {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://pokeapi.co/api/v2/pokemon/";

    /**
     * Constructor-based dependency injection for {@link RestTemplate}.
     *
     * @param restTemplate The {@link RestTemplate} instance used to make API calls.
     */
    @Autowired
    public PokeApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Retrieves Pokémon data by its name from the external API.
     * <p>
     * This method constructs the URL using the Pokémon name, makes an HTTP GET request, and returns a {@link Pokemon} object
     * containing the details of the requested Pokémon.
     * </p>
     *
     * @param name The name of the Pokémon to fetch.
     * @return A {@link Pokemon} object containing the requested Pokémon's details, or {@code Optional.empty()} if not found.
     */
    public Optional<Pokemon> getPokemonByName(String name) {
        String url = baseUrl + name.toLowerCase();
        try {
            // Intentar obtener el Pokémon
            Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
            return Optional.ofNullable(pokemon);  // Retorna un Optional para manejar nulos
        } catch (HttpClientErrorException.NotFound e) {
            // Manejo específico para el caso en que el Pokémon no se encuentra
            return Optional.empty();  // Retorna un Optional vacío si no se encuentra el Pokémon
        } catch (HttpServerErrorException e) {
            // Manejo de errores internos del servidor
            throw new RuntimeException("Error en el servidor al obtener el Pokémon", e);
        } catch (Exception e) {
            // Cualquier otro error no esperado
            throw new RuntimeException("Error desconocido al obtener el Pokémon", e);
        }
    }
}

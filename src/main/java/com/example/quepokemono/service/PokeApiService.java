package com.example.quepokemono.service;

import com.example.quepokemono.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
     * @return A {@link Pokemon} object containing the requested Pokémon's details.
     */
    public Pokemon getPokemonByName(String name) {
        String url = baseUrl + name.toLowerCase();
        return restTemplate.getForObject(url, Pokemon.class);
    }
}
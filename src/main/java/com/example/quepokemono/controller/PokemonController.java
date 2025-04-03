package com.example.quepokemono.controller;

import com.example.quepokemono.model.Pokemon;
import com.example.quepokemono.service.PokeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * REST Controller for handling Pokémon-related requests.
 * <p>
 * This controller provides an endpoint to fetch Pokémon details by name,
 * retrieving data from an external API via {@link PokeApiService}.
 * </p>
 */
@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokeApiService pokeApiService;

    /**
     * Constructor-based dependency injection for {@link PokeApiService}.
     *
     * @param pokeApiService Service to handle Pokémon API requests.
     */
    @Autowired
    public PokemonController(PokeApiService pokeApiService) {
        this.pokeApiService = pokeApiService;
    }

    /**
     * Retrieves information about a Pokémon by its name.
     * <p>
     * This endpoint calls the external Pokémon API and returns a {@link Pokemon} object
     * containing details such as type, abilities, and stats.
     * </p>
     *
     * @param name The name of the Pokémon to fetch.
     * @return A {@link Pokemon} object with the requested Pokémon's details.
     */
    @GetMapping("/{name}")
    public ResponseEntity<Pokemon> getPokemon(@PathVariable String name) {
        Optional<Pokemon> pokemon = pokeApiService.getPokemonByName(name);
        if (pokemon.isPresent()) {
            return ResponseEntity.ok(pokemon.get());  // Devuelve un 200 OK si el Pokémon se encuentra
        } else {
            return ResponseEntity.notFound().build();  // Devuelve un 404 Not Found si no se encuentra el Pokémon
        }
    }
}
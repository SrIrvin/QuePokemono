package com.example.quepokemono.controller;

import com.example.quepokemono.model.Pokemon;
import com.example.quepokemono.service.PokeApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokeApiService pokeApiService;

    @Autowired
    public PokemonController(PokeApiService pokeApiService) {
        this.pokeApiService = pokeApiService;
    }

    @GetMapping("/{name}")
    public Pokemon getPokemon(@PathVariable String name) {
        return pokeApiService.getPokemonByName(name);
    }
}
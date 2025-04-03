package com.example.quepokemono.service;

import com.example.quepokemono.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokeApiService {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://pokeapi.co/api/v2/pokemon/";

    @Autowired
    public PokeApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Pokemon getPokemonByName(String name) {
        String url = baseUrl + name.toLowerCase();
        return restTemplate.getForObject(url, Pokemon.class);
    }
}

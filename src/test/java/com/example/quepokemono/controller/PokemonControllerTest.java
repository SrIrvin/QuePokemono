package com.example.quepokemono.controller;

import com.example.quepokemono.model.Pokemon;
import com.example.quepokemono.service.PokeApiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonControllerTest {
/**
    @Mock
    private PokeApiService pokeApiService;

    @InjectMocks
    private PokemonController pokemonController;

    private Pokemon pokemon;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        pokemon = new Pokemon();
        pokemon.setName("Pikachu");
        pokemon.setId(1);  // Asegúrate de establecer las propiedades necesarias en el objeto Pokemon
    }

    @Test
    public void testGetPokemonValidName() {
        // Arrange
        String pokemonName = "pikachu";
        // Simula que el servicio devuelve un Optional con el Pokémon
        when(pokeApiService.getPokemonByName(pokemonName)).thenReturn(Optional.of(pokemon));

        // Act
        ResponseEntity<Pokemon> response = pokemonController.getPokemon(pokemonName);

        // Assert
        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals("Pikachu", response.getBody().getName());
    }

    @Test
    public void testGetPokemonNotFound() {
        // Arrange
        String pokemonName = "charizard";
        // Simula que el Pokémon no se encuentra (devuelve un Optional vacío)
        when(pokeApiService.getPokemonByName(pokemonName)).thenReturn(Optional.empty());

        // Act
        ResponseEntity<Pokemon> response = pokemonController.getPokemon(pokemonName);

        // Assert
        assertEquals(404, response.getStatusCodeValue());
        assertNull(response.getBody());
    }

    @Test
    public void testGetPokemonServiceError() {
        // Arrange
        String pokemonName = "pikachu";
        // Simula un error en el servicio (lanzando una excepción)
        when(pokeApiService.getPokemonByName(pokemonName))
                .thenThrow(new RuntimeException("Service error"));

        // Act & Assert
        try {
            pokemonController.getPokemon(pokemonName);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Service error"));
        }
    }**/
}


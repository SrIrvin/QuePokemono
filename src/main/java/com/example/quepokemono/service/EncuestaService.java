package com.example.quepokemono.service;

import com.example.quepokemono.model.Encuesta;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService {

    public String procesarEncuesta(Encuesta encuesta) {
        int[] conteo = new int[4]; // A, B, C, D

        // Contamos las respuestas
        conteo[respuestaToIndice(encuesta.getRespuesta1())]++;
        conteo[respuestaToIndice(encuesta.getRespuesta2())]++;
        conteo[respuestaToIndice(encuesta.getRespuesta3())]++;
        conteo[respuestaToIndice(encuesta.getRespuesta4())]++;
        conteo[respuestaToIndice(encuesta.getRespuesta5())]++;

        // Determinamos el Pokémon
        return determinarPokemon(conteo);
    }

    private int respuestaToIndice(String respuesta) {
        switch (respuesta) {
            case "A":
                return 0; // Bulbasaur
            case "B":
                return 1; // Charmander
            case "C":
                return 2; // Squirtle
            case "D":
                return 3; // Gengar
            default:
                throw new IllegalArgumentException("Respuesta inválida");
        }
    }

    private String determinarPokemon(int[] conteo) {
        // Determinamos la respuesta con más votos
        int max = 0;
        int indiceMax = -1;

        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > max) {
                max = conteo[i];
                indiceMax = i;
            }
        }

        // Lógica de empate
        if (conteo[0] == conteo[1] && conteo[0] > 1) {
            return "Charmander";
        } else if (conteo[0] == conteo[2] && conteo[0] > 1) {
            return "Squirtle";
        } else if (conteo[1] == conteo[2] && conteo[1] > 1) {
            return "Charmander";
        } else if (conteo[3] > 0) {
            return "Gengar";
        } else {
            switch (indiceMax) {
                case 0:
                    return "Bulbasaur";
                case 1:
                    return "Charmander";
                case 2:
                    return "Squirtle";
                case 3:
                    return "Gengar";
                default:
                    return "Error";
            }
        }
    }
}

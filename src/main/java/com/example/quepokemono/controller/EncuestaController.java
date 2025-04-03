package com.example.quepokemono.controller;

import com.example.quepokemono.model.Encuesta;
import com.example.quepokemono.service.EncuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EncuestaController {

    private final EncuestaService encuestaService;

    @Autowired
    public EncuestaController(EncuestaService encuestaService) {
        this.encuestaService = encuestaService;
    }

    public String obtenerPokemon(Encuesta encuesta) {
        return encuestaService.procesarEncuesta(encuesta);
    }
}

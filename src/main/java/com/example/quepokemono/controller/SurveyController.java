package com.example.quepokemono.controller;

import com.example.quepokemono.model.Survey;
import com.example.quepokemono.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController  // Convierte la clase en un controlador REST
@RequestMapping("api/v1/")  // Define el endpoint base
public class SurveyController {

    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    // 🔥 Permitir datos en el body, query params y headers
    @PostMapping("get-pokemon")
    public Map<String, String> getPokemon(
            @RequestBody(required = false) Survey survey, // Permite datos en el body
            @RequestParam(required = false) String answer1, // Permite query params
            @RequestParam(required = false) String answer2,
            @RequestParam(required = false) String answer3,
            @RequestParam(required = false) String answer4,
            @RequestParam(required = false) String answer5,
            @RequestHeader(value = "X-Answer-1", required = false) String headerAnswer1 // Permite datos en headers
    ) {
        // Si el body es nulo, construir un `Survey` con los parámetros recibidos
        if (survey == null) {
            survey = new Survey();
            survey.setAnswer1(answer1 != null ? answer1 : headerAnswer1); // Prioriza query params, luego headers
            survey.setAnswer2(answer2);
            survey.setAnswer3(answer3);
            survey.setAnswer4(answer4);
            survey.setAnswer5(answer5);
        }

        String pokemon = surveyService.processSurvey(survey);
        Map<String, String> response = new HashMap<>();
        response.put("pokemon", pokemon);
        return response;
    }
}

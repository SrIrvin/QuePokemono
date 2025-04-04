package com.example.quepokemono.service;

import com.example.quepokemono.model.Survey;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

    public String processSurvey(Survey survey) {
        int[] count = new int[4]; // A, B, C, D

        // Here, I count the answers
        count[answerToIndex(survey.getAnswer1())]++;
        count[answerToIndex(survey.getAnswer2())]++;
        count[answerToIndex(survey.getAnswer3())]++;
        count[answerToIndex(survey.getAnswer4())]++;
        count[answerToIndex(survey.getAnswer5())]++;

        // let's determine the Pokemon
        return determinePokemon(count);
    }

    private int answerToIndex(String answer) {
        switch (answer) {
            case "A":
                return 0; // Bulbasaur
            case "B":
                return 1; // Charmander
            case "C":
                return 2; // Squirtle
            case "D":
                return 3; // Gengar
            default:
                throw new IllegalArgumentException("Invalid answer");
        }
    }

    private String determinePokemon(int[] count) {
        // We determine the answer with the most votes
        int max = 0;
        int indiceMax = -1;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                indiceMax = i;
            }
        }

        // Lógica de empate
        if (count[0] == count[1] && count[0] > 1) {
            return "Charmander";
        } else if (count[0] == count[2] && count[0] > 1) {
            return "Squirtle";
        } else if (count[1] == count[2] && count[1] > 1) {
            return "Charmander";
        } else if (count[3] > 0) {
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

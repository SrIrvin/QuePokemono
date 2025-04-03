package com.example.quepokemono.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to check the health status of the API.
 * <p>
 * This controller provides an endpoint to verify that the application is running
 * and reachable at the network layer (Layer 7 - Application Layer).
 * </p>
 */
@RestController
@RequestMapping("/api/health")
public class HealthController {

    /**
     * Simple health check endpoint.
     * <p>
     * This endpoint returns a confirmation message indicating that the API is running.
     * It can be used for monitoring purposes to ensure service availability.
     * </p>
     *
     * @return A message confirming that the API is operational.
     */
    @GetMapping("/ping")
    public String ping() {
        return "QuePokemono API is up and running!";
    }
}
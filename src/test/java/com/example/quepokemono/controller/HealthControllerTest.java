package com.example.quepokemono.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Unit tests for the {@link HealthController}.
 * <p>
 * This class contains unit tests for the {@link HealthController}, which exposes the "/api/health/ping" endpoint.
 * The tests ensure that the controller returns the expected responses.
 * </p>
 */
@WebMvcTest(HealthController.class)
public class HealthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Set up method to initialize the test environment before each test.
     * This method is executed before every test to prepare the testing context.
     */
    @BeforeEach
    public void setUp() {
        // Initial setup can be done here if needed
    }

    /**
     * Test the /api/health/ping endpoint to ensure it returns the expected status and message.
     * <p>
     * This test verifies that when a GET request is made to the /api/health/ping endpoint,
     * the response has a status of 200 OK and the content is the expected message:
     * "QuePokemono API is up and running!".
     * </p>
     *
     * @throws Exception if the test fails to execute properly.
     */
    @Test
    public void testPingEndpoint() throws Exception {
        mockMvc.perform(get("/api/health/ping"))
                .andExpect(status().isOk())  // Verify that the status code is 200 OK
                .andExpect(content().string("QuePokemono API is up and running!"));  // Verify that the content matches the expected response
    }
}

package com.example.api.integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiControllerIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @DisplayName("Index returns Hello world message when successful")
    void index_ReturnsHelloWorld_WhenSuccessful() {
        String url = "/";
        Class<String> responseType = String.class;
        String response = testRestTemplate.getForObject(url, responseType);
        Assertions.assertThat(response).isEqualTo("Hello world");
    }

}

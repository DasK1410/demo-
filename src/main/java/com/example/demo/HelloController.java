package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller that handles incoming HTTP requests.
 * The @RestController annotation indicates that the data returned by each method will be written
 * straight into the response body instead of rendering a template.
 */
@RestController
public class HelloController {

    /**
     * Handles GET requests mapping to the root URL ("/").
     *
     * @return A plain text greeting "Hello World"
     */
    @GetMapping("/")
    public String hello() {
        return "Hello manoj";
    }
}

package com.arifwider.webtech_projekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public List<Todo> testRoute() {
        return List.of(
                new Todo("Test Todo 1", "This is a test todo item 1."),
                new Todo("Test Todo 2", "This is a test todo item 2."),
                new Todo("Test Todo 3", "This is a test todo item 3.")
        );
    }
}
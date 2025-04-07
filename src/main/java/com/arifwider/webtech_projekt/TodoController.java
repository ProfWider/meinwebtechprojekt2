package com.arifwider.webtech_projekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todo")
    public Todo testRoute() {
        return new Todo("Test Todo", "This is a test todo item.");
    }
}
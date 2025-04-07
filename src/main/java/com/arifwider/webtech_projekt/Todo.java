package com.arifwider.webtech_projekt;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {
    private String title;
    private String description;
    private boolean completed;
    @Id
    private Long id;

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Todo() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

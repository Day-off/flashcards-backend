package com.example.flashcardsbackend.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface BasicController {

    @PostMapping
    void create();

    @GetMapping
    void read();

    @PutMapping
    void update();

    @DeleteMapping
    void delete();
}

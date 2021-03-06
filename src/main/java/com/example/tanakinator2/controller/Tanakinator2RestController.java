package com.example.tanakinator2.controller;

import com.example.tanakinator2.domain.Choice;
import com.example.tanakinator2.service.Tanakinator2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api")
public class Tanakinator2RestController {
    private static final Logger logger = LoggerFactory.getLogger(Tanakinator2RestController.class);
    private final Tanakinator2Service service;

    public Tanakinator2RestController(Tanakinator2Service service) {
        this.service = service;
    }

    @GetMapping(path = "", produces = "application/json")
    public String home() {
        return "Hello";
    }

    @GetMapping(path = "choice", produces = "application/json")
    public List<Choice> choiceDetail() {
        return service.getAllChoices();
    }

    @GetMapping(path = "choice/{choiceId}", produces = "application/json")
    public Choice choiceDetail(@PathVariable int choiceId) {
        return service.getChoice(choiceId);
    }
}

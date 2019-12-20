package com.isilona.pocautodeploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> readAll() {
        return ResponseEntity
                .ok()
                .body("Hello");
    }

}
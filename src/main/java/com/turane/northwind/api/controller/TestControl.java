package com.turane.northwind.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestControl {

    @GetMapping("/salam")
    public String salamla(){

        return "<h1>Salam BoostCamp</h1>";
    }
}

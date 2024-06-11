package ru.sysoev.springcource.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @Value("${valuefortest}")
    private String testValue;
    @GetMapping("/first")
    public String first() {
        System.out.println(testValue);
        return "first";
    }
}

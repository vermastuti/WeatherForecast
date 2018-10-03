package com.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.weather.entity.City;

@Controller
public class WebController {

    @GetMapping("/city")
    public String cityForm(Model model) {
        model.addAttribute("city", new City());
        return "city";
    }

    @PostMapping("/city")
    public String citySubmit(@ModelAttribute City city) {
        return "result";
    }

}
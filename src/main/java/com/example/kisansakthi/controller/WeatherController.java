package com.example.kisansakthi.controller;

import com.example.kisansakthi.model.WeatherResponse;
import com.example.kisansakthi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{district}")
    public WeatherResponse getWeather(@PathVariable String district) {

        return weatherService.getWeather(district);

    }

}
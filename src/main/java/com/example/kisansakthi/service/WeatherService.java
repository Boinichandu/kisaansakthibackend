package com.example.kisansakthi.service;

import com.example.kisansakthi.model.WeatherResponse;

public interface WeatherService {

    WeatherResponse getWeather(String district);

}
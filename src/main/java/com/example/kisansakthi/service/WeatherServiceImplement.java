package com.example.kisansakthi.service;

import com.example.kisansakthi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class WeatherServiceImplement implements WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    @Override
    public WeatherResponse getWeather(String district) {

        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + district
                + ",IN&units=metric&appid="
                + apiKey;

        Map<String, Object> response = restTemplate.getForObject(url, Map.class);

        WeatherResponse weather = new WeatherResponse();

        weather.setDistrict(district);

        // Main Weather
        Map<String, Object> main = (Map<String, Object>) response.get("main");

        weather.setTemperature(((Number) main.get("temp")).doubleValue());
        weather.setFeelsLike(((Number) main.get("feels_like")).doubleValue());
        weather.setHumidity(((Number) main.get("humidity")).intValue());

        // Wind
        Map<String, Object> wind = (Map<String, Object>) response.get("wind");
        weather.setWindSpeed(((Number) wind.get("speed")).doubleValue());

        // Weather Description
        List<Map<String, Object>> weatherList =
                (List<Map<String, Object>>) response.get("weather");

        weather.setDescription(weatherList.get(0).get("description").toString());
        weather.setIcon(weatherList.get(0).get("icon").toString());

        // Sunrise & Sunset
        Map<String, Object> sys = (Map<String, Object>) response.get("sys");

        long sunrise = ((Number) sys.get("sunrise")).longValue() * 1000;
        long sunset = ((Number) sys.get("sunset")).longValue() * 1000;

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");

        weather.setSunrise(sdf.format(new Date(sunrise)));
        weather.setSunset(sdf.format(new Date(sunset)));

        return weather;
    }
}
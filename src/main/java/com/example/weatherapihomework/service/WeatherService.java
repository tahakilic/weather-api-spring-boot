package com.example.weatherapihomework.service;

import com.example.weatherapihomework.model.WeatherDto;
import org.springframework.http.ResponseEntity;

public interface WeatherService {
    ResponseEntity<WeatherDto> getWeatherByCity(String cityName);
}

package com.example.weatherapihomework.service;

import com.example.weatherapihomework.model.CustomWeatherDto;
import com.example.weatherapihomework.model.WeatherDto;
import org.springframework.http.ResponseEntity;

public interface WeatherService {
    ResponseEntity<WeatherDto> getWeatherByCity(String cityName);
    ResponseEntity<CustomWeatherDto>  getPathWeatherByCity(String cityName);
    ResponseEntity<CustomWeatherDto> getCustomWeatherByCity(CustomWeatherDto customWeatherDto);
}

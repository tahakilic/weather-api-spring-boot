package com.example.weatherapihomework.controller;
import com.example.weatherapihomework.model.WeatherDto;
import com.example.weatherapihomework.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/getWeatherByCity/", produces = "application/json")
public class WeatherController {

    private WeatherService weatherService;

    @GetMapping(path = "{cityName}")
    public ResponseEntity<WeatherDto> getWeatherByCity(@PathVariable String cityName){
        return weatherService.getWeatherByCity(cityName);
    }



    @Autowired
    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}

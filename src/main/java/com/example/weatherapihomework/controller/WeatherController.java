package com.example.weatherapihomework.controller;
import com.example.weatherapihomework.model.CustomWeatherDto;
import com.example.weatherapihomework.model.WeatherDto;
import com.example.weatherapihomework.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/", produces = "application/json")
public class WeatherController {

    private WeatherService weatherService;

    //@PathVariable annotation example
    //localhost:8080/api/getWeatherByCity/bursa
    @GetMapping(path = "getWeatherByCity/{cityName}")
    public ResponseEntity<WeatherDto> getWeatherByCity(@PathVariable String cityName){
        return weatherService.getWeatherByCity(cityName);
    }


    //@RequestParam annotation example
    //localhost:8080/api/getPathWeatherByCity?countryName=Bursa
    @GetMapping(path = "getPathWeatherByCity")
    public ResponseEntity<CustomWeatherDto> getPathWeatherByCity(@RequestParam(value = "countryName")String countryName){
        return weatherService.getPathWeatherByCity(countryName);
    }

    //@RequestBody annotation example
    /*
     * localhost:8080/api/getCustomWeatherByCity
     * body= {"cityName":"bursa"}
     */
    @PostMapping(path = "getCustomWeatherByCity")
    public ResponseEntity<CustomWeatherDto> getCustomWeatherByCity(@RequestBody CustomWeatherDto customWeatherDto){
        return weatherService.getCustomWeatherByCity(customWeatherDto);
    }



    @Autowired
    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}

package com.example.weatherapihomework.configuration;

import com.example.weatherapihomework.model.CustomWeatherDto;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public CustomWeatherDto customWeatherDto(){
        return new CustomWeatherDto();
    }


}

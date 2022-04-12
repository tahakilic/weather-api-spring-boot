package com.example.weatherapihomework.serviceImpl;

import com.example.weatherapihomework.model.WeatherDto;
import com.example.weatherapihomework.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherServiceImpl implements WeatherService {

     private RestTemplate restTemplate;

    @Override
    public ResponseEntity<WeatherDto> getWeatherByCity(String cityName) {
        String url="http://api.weatherstack.com/current?access_key=bd29c0fd2008fd83d044d1086d0eec39&query="+cityName;
        ResponseEntity<WeatherDto> result=restTemplate.getForEntity(url,WeatherDto.class);
        WeatherDto responseBody=result.getBody();
        System.out.println("-------------"+result);
        System.out.println("-------------"+responseBody.getCurrent());
        return ResponseEntity.ok(responseBody);

    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}

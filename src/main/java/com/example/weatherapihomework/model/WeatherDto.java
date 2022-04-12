package com.example.weatherapihomework.model;

import com.example.weatherapihomework.model.dto.Current;
import com.example.weatherapihomework.model.dto.Location;
import com.example.weatherapihomework.model.dto.Request;
import lombok.Data;

@Data
public class WeatherDto {

    private Request request;
    private Location location;
    private Current current;


}



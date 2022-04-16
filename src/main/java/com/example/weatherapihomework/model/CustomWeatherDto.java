package com.example.weatherapihomework.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CustomWeatherDto {
    @NotNull(message = "Şehir ismi boş geçilemez!")
    private String cityName;
    private String countryName;
    private Integer temperature;
    private String[] weatherDescriptions;
}

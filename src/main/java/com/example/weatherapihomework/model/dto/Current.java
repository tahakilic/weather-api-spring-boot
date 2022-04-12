package com.example.weatherapihomework.model.dto;

import lombok.Data;

@Data
public class Current {
    private String observation_time;
    private int temperature;
    private int weather_code;
    private String[] weather_icons;
    private String[] weather_descriptions;
    private int wind_speed;
    private int wind_degree;
    private String wind_dir;
    private int pressure;
    private double precip;
    private int humidity;
    private int cloudcover;
    private int feelslike;
    private int uv_index;
    private int visibility;
    private String is_day;


}

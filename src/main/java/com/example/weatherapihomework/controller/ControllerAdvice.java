package com.example.weatherapihomework.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NullPointerException.class)
    public String onNullPointerException(){
        return "Boş , Eksik veya Yanlış Değer. Girdiğiniz Değeri Kontrol Ediniz!";
    }
}

package com.example.Atividade.models;

import org.springframework.stereotype.Component;

// Utilizado https://json2csharp.com/code-converters/json-to-pojo
// para converter o JSON da API para uma classe :D
@Component
public class Forecast {
    public String day;
    public String temperature;
    public String wind;

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

package com.example.Atividade.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

// Utilizado https://json2csharp.com/code-converters/json-to-pojo
// para converter o JSON da API para uma classe :D
@Component
public class WeatherModel {
        public String temperature;
        public String wind;
        public String description;
        public ArrayList<Forecast> forecast;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(ArrayList<Forecast> forecast) {
        this.forecast = forecast;
    }
}

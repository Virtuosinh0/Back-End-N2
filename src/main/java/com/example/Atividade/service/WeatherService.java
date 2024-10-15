package com.example.Atividade.service;

import com.example.Atividade.models.WeatherModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


//Não estava funcionando mais depois de infinitas tentativas, funcionou,
//Não sei o que esta diferente da primeira tentativa ;-;
@Service //Semestre passado eu esqueci desse bixo aqui
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherModel getWeather(String city) {
        // API do Github https://github.com/robertoduessmann/weather-api/tree/master
        // A mesma utilizada do semenstre passado, porém funcionando
        String url = "https://goweather.herokuapp.com/weather/" + city;
        return restTemplate.getForObject(url, WeatherModel.class);
    }
}

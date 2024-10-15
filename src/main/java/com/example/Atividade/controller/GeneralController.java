package com.example.Atividade.controller;

import com.example.Atividade.models.WeatherModel;
import com.example.Atividade.service.WeatherService;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GeneralController {
    //Por alguma razão o código que funcionou na aula não funcionou no meu PC
    //Mas o Mapping do meu projeto do semestre passado funcionou
    @GetMapping({"/sobre", "/about"})
    public String obterCreditos() {
        return "estudante: Silvio," + System.lineSeparator() +
                "projeto: Atividade N2 controle de clima";
        //Não está retornando em formato JSON
    }

    // Duas rotas GET
    @GetMapping({"/cidade", "/city"})
    public String ola(@RequestParam String cidade){
        return "Olá " + cidade;
        //Não está retornando em formato JSON
    }

    private final WeatherService weatherService;

    public GeneralController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // Uma rota POST
    // Não está funcionando no navegador, mas sim no Insomnia  (provavelmente por ser JSON)
    @PostMapping("/weather")
    public WeatherModel postWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
        //A propria API retorna JSON LMAO
    }
}

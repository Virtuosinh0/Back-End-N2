package com.example.Atividade.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// Não tenho muita certeza da necessidade desse cara, mas ta na API :D
// https://github.com/robertoduessmann/weather-api/tree/master/config
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

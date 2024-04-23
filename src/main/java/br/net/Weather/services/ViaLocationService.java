package br.net.Weather.services;

import br.net.Weather.models.WeatherSituation;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;

@Service
public class ViaLocationService implements LocationService {
    private RestClient client = RestClient.create("https://goweather.herokuapp.com/weather");

    @Override
    public WeatherSituation DefineCity(String City) {
        try {
        return client
                .get()
                .uri("/{City}", City)
                .retrieve()
                .body(WeatherSituation.class);
        } catch (RestClientResponseException e) {
            throw new RestClientException("Erro de comunicação com a API", e);
        } catch (RestClientException e) {
            throw new RestClientException("Erro de comunicação com a API", e);
        }
    }
}

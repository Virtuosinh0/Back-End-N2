package br.net.Weather.services;

import br.net.Weather.models.WeatherSituation;

public interface LocationService {
    public WeatherSituation DefineCity(String Result);
}

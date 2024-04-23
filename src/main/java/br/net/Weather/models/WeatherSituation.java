package br.net.Weather.models;

// Referente a https://github.com/robertoduessmann/weather-api/blob/master/model/weather.go
public class WeatherSituation {
    private WeatherStruct Weather;
    private Forecast[] Forecast;
    private ErrorMessage ErrorMessage;

    private static class WeatherStruct {
        private String[] temperature;
        private String[] wind;
        private String[] description;
    }

    private static class Forecast {
        private String[] day;
        private String[] temperature;
        private String[] wind;
    }
    private static class ErrorMessage {
        private String[] message;
    }

    public WeatherSituation(WeatherStruct weather, WeatherSituation.Forecast[] forecast, WeatherSituation.ErrorMessage errorMessage) {
        Weather = weather;
        Forecast = forecast;
        ErrorMessage = errorMessage;
    }

    public WeatherStruct getWeather() {
        return Weather;
    }
    public WeatherSituation.Forecast[] getForecast() {
        return Forecast;
    }
    public WeatherSituation.ErrorMessage getErrorMessage() {
        return ErrorMessage;
    }
}

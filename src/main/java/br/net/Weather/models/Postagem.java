package br.net.Weather.models;

public class Postagem {
    private String City;
    private WeatherSituation remetente;
    private WeatherSituation destinatario;

    public Postagem(String cidade, WeatherSituation remetente, WeatherSituation destinatario) {
        this.City = cidade;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public WeatherSituation getRemetente() {
        return remetente;
    }

    public void setRemetente(WeatherSituation remetente) {
        this.remetente = remetente;
    }

    public WeatherSituation getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(WeatherSituation destinatario) {
        this.destinatario = destinatario;
    }
}

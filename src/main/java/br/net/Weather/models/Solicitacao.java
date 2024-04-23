package br.net.Weather.models;

public class Solicitacao {
    private String city;
    private String remetente;
    private String destinatario;

    // Construtor
    public Solicitacao(String city, String remetente, String destinatario) {
        this.city = city;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    // Getters e setters para city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getters e setters para remetente
    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    // Getters e setters para destinatario
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}

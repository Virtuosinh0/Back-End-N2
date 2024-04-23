package br.net.Weather.controllers;

import br.net.Weather.models.Credits;
import br.net.Weather.models.WeatherSituation;
import br.net.Weather.models.Postagem;
import br.net.Weather.models.Solicitacao;
import br.net.Weather.services.LocationService;
import br.net.Weather.services.ViaLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
public class PostagemController {
    @Autowired
    private LocationService locationService;
    private ArrayList<Postagem> listaDePostagems = new ArrayList<>();
    @Autowired
    private ViaLocationService viaLocationService;

    @PostMapping(value = {"/postar", "/post"})
    public ResponseEntity<Object> recupera() {
        return ResponseEntity.status(200).body(listaDePostagems);
    }

    @GetMapping(value = {"/postar", "/post"})
    public ResponseEntity<Object> postar(@RequestBody Solicitacao solicitacao) {
        WeatherSituation enderecoDestinatario = locationService.DefineCity(solicitacao.getDestinatario());
        WeatherSituation enderecoRemetente = locationService.DefineCity(solicitacao.getRemetente());
        Postagem postagem = new Postagem(
                "Criciuma",
                enderecoDestinatario,
                enderecoRemetente
        );
        listaDePostagems.add(postagem);
        return ResponseEntity.status(200).body(postagem);
    }

    @GetMapping("/tellme")
    public String tellme() {
        WeatherSituation WeatherTest;
        WeatherTest = viaLocationService.DefineCity("Criciuma");
        return "<h1>" + WeatherTest + "</h1>";
    }

    @GetMapping(value = {"/ajuda", "/help"})
    public String obterCreditos() {
        Credits student = new Credits();
        return student.getCredits();
    }
}

package org.challenceAlura;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convertidor {
    private String urlAPI;
    private int cantidad;
    private String primerPais;
    private String segundoPais;

    public Convertidor(String url_api, int cantidad, String paisEntrada, String paisSalida){
        this.cantidad = cantidad;
        this.urlAPI = url_api;
        this.primerPais = paisEntrada;
        this.segundoPais = paisSalida;
    }

    public String conversion() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(getUrlAPI() + getPrimerPais() +
                        "/"+ getSegundoPais() + "/" + String.valueOf(getCantidad())))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        Resultado results = gson.fromJson(response.body(), Resultado.class);
        return "El Resultado es " + getCantidad() + " " + getPrimerPais() + " a " +
               getSegundoPais() + " es: " + results.getCantidad() + " " +results.getPaisSalida();
    }

    public String getUrlAPI() {
        return urlAPI;
    }

    public void setUrlAPI(String urlAPI) {
        this.urlAPI = urlAPI;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrimerPais() {
        return primerPais;
    }

    public void setPrimerPais(String primerPais) {
        this.primerPais = primerPais;
    }

    public String getSegundoPais() {
        return segundoPais;
    }

    public void setSegundoPais(String segundoPais) {
        this.segundoPais = segundoPais;
    }
}

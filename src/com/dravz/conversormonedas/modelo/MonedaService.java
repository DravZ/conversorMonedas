package com.dravz.conversormonedas.modelo;

import com.dravz.conversormonedas.dto.ExchangeRate;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MonedaService {
    public double getConversionRate(String pair){
        String direccion = "https://v6.exchangerate-api.com/v6/93f46089ad55ee6769607420/pair/"+pair;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            ExchangeRate exchangeRate = new Gson().fromJson(response.body(), ExchangeRate.class);
            return exchangeRate.conversion_rate();
        } catch (Exception e) {
            throw new RuntimeException("Moneda de cambio no encotrado. " + e);
        }
    }
}

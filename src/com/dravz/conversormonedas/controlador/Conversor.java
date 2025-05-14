package com.dravz.conversormonedas.controlador;

import com.dravz.conversormonedas.modelo.MonedaService;

public class Conversor {
    public double convertir(String monedaBase, String monedaCambio, double cantidad){
        MonedaService monedaService = new MonedaService();
        String peticionConversion = monedaBase + "/" + monedaCambio;
        return monedaService.getConversionRate(peticionConversion) * cantidad;
    }
}

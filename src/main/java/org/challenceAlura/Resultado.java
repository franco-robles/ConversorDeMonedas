package org.challenceAlura;

import com.google.gson.annotations.SerializedName;

/**
 * En esta clase se guarda el resultado del json, solo la cantidad resultante despues de convertir la moneda
 * y el pais de salida
 */
public class Resultado {
    @SerializedName("conversion_result")
    private double cantidad;
    @SerializedName("target_code")
    private String paisSalida;

    public Resultado(double cantidad, String paisSalida) {
        this.cantidad = cantidad;
        this.paisSalida = paisSalida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getPaisSalida() {
        return paisSalida;
    }

}

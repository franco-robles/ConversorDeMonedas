package org.challenceAlura;

import com.google.gson.annotations.SerializedName;

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

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getPaisSalida() {
        return paisSalida;
    }

    public void setPaisSalida(String paisSalida) {
        this.paisSalida = paisSalida;
    }
}

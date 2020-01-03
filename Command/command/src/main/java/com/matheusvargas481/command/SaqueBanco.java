package com.matheussoilegra.coreengineering.tema17;

public class SaqueBanco implements ServicoBanco {

    private double valor;

    public SaqueBanco(double valor) {
        this.valor = valor;
    }

    @Override
    public double executar() {
        return -valor;
    }

    @Override
    public String toString() {
        return "Saque no valor de R$ " + valor;
    }

}



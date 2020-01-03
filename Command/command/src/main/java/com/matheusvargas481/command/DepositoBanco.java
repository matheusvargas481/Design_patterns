package com.matheussoilegra.coreengineering.tema17;

public class DepositoBanco implements ServicoBanco {

    private double valor;

    public DepositoBanco(double valor) {
        this.valor = valor;
    }

    @Override
    public double executar() {
        return +valor;
    }

    @Override
    public String toString() {
        return "Depósito no valor de R$ " + valor;
    }

}

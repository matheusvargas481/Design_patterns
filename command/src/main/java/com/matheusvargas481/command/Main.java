package com.matheussoilegra.coreengineering.tema17;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.getHistorico();

        DepositoBanco depositoBanco = new DepositoBanco(50.0);
        banco.adicionarServicoBanco(depositoBanco);

        SaqueBanco saqueBanco = new SaqueBanco(25.0);
        banco.adicionarServicoBanco(saqueBanco);

        depositoBanco = new DepositoBanco(20.0);
        banco.adicionarServicoBanco(depositoBanco);

        saqueBanco = new SaqueBanco(10.0);
        banco.adicionarServicoBanco(saqueBanco);

        System.out.println(banco.saldoAtual());
    }
}

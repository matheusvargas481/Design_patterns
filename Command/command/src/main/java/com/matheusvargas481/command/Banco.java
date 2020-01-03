package com.matheussoilegra.coreengineering.tema17;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<ServicoBanco> historico = new ArrayList<>();

    public void adicionarServicoBanco(ServicoBanco servicoBanco) {
        historico.add(servicoBanco);
    }

    public List<ServicoBanco> getHistorico() {
        return historico;
    }

    public void executarServicoBanco() {
        for (ServicoBanco servicoBanco : historico) {
            servicoBanco.executar();
        }
    }

    public Double informarSaldo() {
        return historico.stream().mapToDouble(ServicoBanco::executar).sum();
    }

    public String saldoAtual() {
        return "Saldo atual de R$ " + informarSaldo();
    }
}


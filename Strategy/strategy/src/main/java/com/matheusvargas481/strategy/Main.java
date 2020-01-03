package com.matheusvargas481.strategy;

public class Main {
    public static void main(String[] args) {
        Cliente mensagemEmail = new Cliente("Matheus Santos", "matheus.santos@ilegra.com");
        Cliente mensagemSms = new Cliente("Matheus Santos", "matheus.santos@ilegra.com", "991063366");

        NotificacaoStrategyFactory notificacaoStrategyFactory = new NotificacaoStrategyFactory();

        PainelNotificacao painelNotificacao = new PainelNotificacao(
                notificacaoStrategyFactory.getStrategy(mensagemEmail));
        painelNotificacao.enviar(mensagemEmail);

        System.out.println(painelNotificacao.enviar(mensagemEmail));

        painelNotificacao = new PainelNotificacao(
                notificacaoStrategyFactory.getStrategy(mensagemSms));
        painelNotificacao.enviar(mensagemSms);

        System.out.println(painelNotificacao.enviar(mensagemSms));
    }
}



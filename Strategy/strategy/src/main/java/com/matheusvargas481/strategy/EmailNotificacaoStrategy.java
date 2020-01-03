package com.matheusvargas481.strategy;

public class EmailNotificacaoStrategy implements NotificacaoStrategy {

    @Override
    public String enviarNotificacao(String mostrarNotificacao) {
        return mostrarNotificacao + "Mensagem enviada via e-mail.";
    }
}
package com.matheusvargas481.strategy;

public class SmsNotificacaoStrategy implements NotificacaoStrategy {

    @Override
    public String enviarNotificacao(String mostrarNotificacao ) {
        return mostrarNotificacao + "Mensagem enviada via SMS.";
    }
}
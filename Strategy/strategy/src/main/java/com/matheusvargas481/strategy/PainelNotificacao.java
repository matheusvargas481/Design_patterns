package com.matheusvargas481.strategy;

public class PainelNotificacao {

    private NotificacaoStrategy strategy;
    private MostrarNotificacao mostrarNotificacao;

    public PainelNotificacao(NotificacaoStrategy strategy) {
        this.strategy = strategy;
        this.mostrarNotificacao = new MostrarNotificacao();
    }

    public String enviar(Cliente cliente) {
        return strategy.enviarNotificacao(mostrarNotificacao.mostrarNotificacao(cliente));
    }
}

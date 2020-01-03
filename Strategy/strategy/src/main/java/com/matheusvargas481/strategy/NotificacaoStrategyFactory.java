package com.matheusvargas481.strategy;

public class NotificacaoStrategyFactory {

    public NotificacaoStrategy getStrategy(Cliente cliente) {
        if (cliente.getTelefone() == null) {
            return new EmailNotificacaoStrategy();
        }
        return new SmsNotificacaoStrategy();
    }
}

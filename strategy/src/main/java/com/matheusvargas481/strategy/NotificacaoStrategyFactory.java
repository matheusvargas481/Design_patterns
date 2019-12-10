package com.matheussoilegra.coreengineering.tema13.com.matheussoilegra.coreengineering.tema13.strategy;

import com.matheussoilegra.coreengineering.tema13.Cliente;

public class NotificacaoStrategyFactory {

    public NotificacaoStrategy getStrategy(Cliente cliente) {
        if (cliente.getTelefone() == null) {
            return new EmailNotificacaoStrategy();
        }
        return new SmsNotificacaoStrategy();
    }
}

package com.matheussoilegra.coreengineering.tema13;

import com.matheussoilegra.coreengineering.tema13.com.matheussoilegra.coreengineering.tema13.strategy.EmailNotificacaoStrategy;
import com.matheussoilegra.coreengineering.tema13.com.matheussoilegra.coreengineering.tema13.strategy.SmsNotificacaoStrategy;
import org.junit.Assert;
import org.junit.Test;

public class EnviarNotificacaoTest {

    @Test
    public void testarEnviarNotificacaoEmail() {
        PainelNotificacao painelNotificacao = new PainelNotificacao(new EmailNotificacaoStrategy());
        Assert.assertEquals("Hello, Matheus Santos. Mensagem enviada via e-mail.", painelNotificacao.executarStrategy(new Cliente("Matheus Santos", "matheus.santos@ilegra")));
        Assert.assertNotEquals("Hello, Matheus Santos. Mensagem enviada via SMS.", painelNotificacao.executarStrategy(new Cliente("Matheus Santos", "matheus.santos@ilegra")));
    }

    @Test
    public void testarEnviarNotificacaoSms() {
        PainelNotificacao painelNotificacao = new PainelNotificacao(new SmsNotificacaoStrategy());
        Assert.assertEquals("Hello, Matheus Santos. Mensagem enviada via SMS.", painelNotificacao.executarStrategy(new Cliente("Matheus Santos", "matheus.santos@ilegra", "991063366")));
        Assert.assertNotEquals("Hello, Matheus Santos. Mensagem enviada via e-mail.", painelNotificacao.executarStrategy(new Cliente("Matheus Santos", "matheus.santos@ilegra", "991063366")));
    }

}
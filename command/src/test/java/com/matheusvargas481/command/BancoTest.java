package com.matheussoilegra.coreengineering.tema17;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BancoTest {

    private Banco banco;
    private DepositoBanco depositoBanco;
    private SaqueBanco saqueBanco;

    @Test
    public void testarDepositoBanco() {
        banco = new Banco();
        depositoBanco = new DepositoBanco(500.0);
        banco.adicionarServicoBanco(depositoBanco);
        banco.executarServicoBanco();

        assertEquals("Saldo atual de R$ " + 500.0, banco.saldoAtual());
        assertNotEquals("Saldo atual de R$ " + 700.0, banco.saldoAtual());
        banco.getHistorico().clear();
    }

    @Test
    public void testarSaqueBanco() {
        banco = new Banco();
        depositoBanco = new DepositoBanco(500.0);
        banco.adicionarServicoBanco(depositoBanco);
        saqueBanco = new SaqueBanco(400.0);
        banco.adicionarServicoBanco(saqueBanco);
        banco.executarServicoBanco();

        assertEquals("Saldo atual de R$ " + 100.0, banco.saldoAtual());
        assertNotEquals("Saldo atual de R$ " + 800.0, banco.saldoAtual());
        banco.getHistorico().clear();
    }

}

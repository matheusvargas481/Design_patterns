package com.matheussoilegra.coreengineering.tema14;

import org.junit.Assert;
import org.junit.Test;

public class desempenharFuncaoTest {

    @Test
    public void testarDesempenharFuncaoLanterna() {
        Ferramenta lanterna = FerramentaFactory.getInstance().pegarFerramenta(TipoFerramenta.LANTERNA);
        Assert.assertEquals("Iluminar locais escuros.", lanterna.desempenharFuncao());
        Assert.assertNotEquals("Cortar objetos de pouca espessura.", lanterna.desempenharFuncao());
    }

    @Test
    public void testarDesempenharFuncaoMartelo() {
        Ferramenta martelo = FerramentaFactory.getInstance().pegarFerramenta(TipoFerramenta.MARTELO);
        Assert.assertEquals("Fixar pregos em superfícies.", martelo.desempenharFuncao());
        Assert.assertNotEquals("Cortar objetos de pouca espessura.", martelo.desempenharFuncao());
    }

    @Test
    public void testarDesempenharFuncaoTesoura() {
        Ferramenta tesoura = FerramentaFactory.getInstance().pegarFerramenta(TipoFerramenta.TESOURA);
        Assert.assertEquals("Cortar objetos de pouca espessura.", tesoura.desempenharFuncao());
        Assert.assertNotEquals("Iluminar locais escuros.", tesoura.desempenharFuncao());
    }

    @Test(expected = FerramentaInvalidaException.class)
    public void testarExceptionFerramentaInvalida() {
        Ferramenta ferramentaInvalida = FerramentaFactory.getInstance().pegarFerramenta(TipoFerramenta.FERRAMENTAINVALIDA);
        ferramentaInvalida.desempenharFuncao();
    }


}


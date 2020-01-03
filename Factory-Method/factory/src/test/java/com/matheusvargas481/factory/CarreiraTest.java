package com.matheussoilegra.coreengineering.tema11;

import org.junit.Assert;
import org.junit.Test;

public class CarreiraTest {

    @Test
    public void testDescreverProgramacao() {
        Carreira programacao = new CarreiraFactory().getCarreira(Especialidades.PROGRAMAÇÃO);
        Assert.assertEquals("Desenvolvimento, implementação e correção de sistemas computacionais.", programacao.trabalhar());
    }

    @Test
    public void testDescreverAdvocacia() {
        Carreira advocacia = new CarreiraFactory().getCarreira(Especialidades.ADVOCACIA);
        Assert.assertEquals("Orientação, aconselhamento e representação jurídica de clientes.", advocacia.trabalhar());
    }

    @Test
    public void testDescreverEnfermagem() {
        Carreira enfermagem = new CarreiraFactory().getCarreira(Especialidades.ENFERMAGEM);
        Assert.assertEquals("Prestação de assistência a pacientes hospitalizados.", enfermagem.trabalhar());
    }

}



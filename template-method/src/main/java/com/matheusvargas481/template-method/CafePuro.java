package com.matheussoilegra.coreengineering.tema15;

public class CafePuro extends BebidaQuente {

    @Override
    public String esquentarLiquido() {
        return "Esquentar água.";
    }

    @Override
    public String adicionarSabor() {
        return "Adicionar pó de café.";
    }

    @Override
    public String adicionarLiquido() {
        return "Adicionar água quente.";
    }

    @Override
    public String retirarBebida() {
        return "Café pronto!";
    }

}

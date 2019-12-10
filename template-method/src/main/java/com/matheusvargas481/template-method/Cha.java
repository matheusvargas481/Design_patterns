package com.matheussoilegra.coreengineering.tema15;

public class Cha extends BebidaQuente {

    @Override
    public String esquentarLiquido() {
        return "Esquentar água.";
    }

    @Override
    public String adicionarSabor() {
        return "Adicionar erva do chá.";
    }

    @Override
    public String adicionarLiquido() {
        return "Adicionar água quente.";
    }

    @Override
    public String retirarBebida() {
        return "Chá pronto!.";
    }

}

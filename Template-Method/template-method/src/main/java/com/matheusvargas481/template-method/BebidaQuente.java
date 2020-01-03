package com.matheussoilegra.coreengineering.tema15;

public abstract class BebidaQuente {

    abstract String esquentarLiquido();
    abstract String adicionarSabor();
    abstract String adicionarLiquido();
    abstract String retirarBebida();

    public final String criarBebidaQuente() {
        return esquentarLiquido() + adicionarSabor() + adicionarLiquido() + retirarBebida();
    }

}

package com.matheussoilegra.coreengineering.tema18;

public class CoberturaQueijo extends CoberturaDecorator {

    private static final Double QUEIJO_PRECO = 3.00;

    public CoberturaQueijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + QUEIJO_PRECO;
    }
}

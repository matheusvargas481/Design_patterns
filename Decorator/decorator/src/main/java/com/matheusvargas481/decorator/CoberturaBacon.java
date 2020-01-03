package com.matheussoilegra.coreengineering.tema18;

public class CoberturaBacon extends CoberturaDecorator {

    private static final Double BACON_PRECO= 3.50;

    public CoberturaBacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + BACON_PRECO;
    }
}

package com.matheussoilegra.coreengineering.tema18;

public abstract class CoberturaDecorator implements Pizza {

    private Pizza pizza;

    public CoberturaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Double getPreco() {
        return pizza.getPreco();
    }

}

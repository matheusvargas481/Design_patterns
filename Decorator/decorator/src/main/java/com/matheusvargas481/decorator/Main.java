package com.matheussoilegra.coreengineering.tema18;

public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new BasePizza();
        Pizza pizzaCompleta = new CoberturaBacon(new CoberturaQueijo(new CoberturaQueijo(basePizza)));
        System.out.println("Pizza com bacon e dobro de queijo no valor de R$ " + pizzaCompleta.getPreco());
    }
}
package com.matheussoilegra.coreengineering.tema15;

public class Main {

    public static void main(String[] args) {
        BebidaQuente bebidaQuente;
        bebidaQuente = new CafePuro();
        System.out.println("Preparando um café puro.");
        System.out.println(bebidaQuente.criarBebidaQuente());

        bebidaQuente = new Cha();
        System.out.println("Preparando um chá.");
        System.out.println(bebidaQuente.criarBebidaQuente());
    }

}

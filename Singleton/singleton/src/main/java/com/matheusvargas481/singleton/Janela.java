package com.matheusvargas481.singleton;

public class Janela {
    private static Janela janela = null;

    private Janela() {
    }

    public static Janela getInstance() {
        if (janela == null) {
            janela = new Janela();
        }
        return janela;
    }
}

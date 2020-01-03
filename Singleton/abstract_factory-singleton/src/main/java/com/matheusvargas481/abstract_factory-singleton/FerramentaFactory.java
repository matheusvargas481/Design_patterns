package com.matheussoilegra.coreengineering.tema14;

public class FerramentaFactory {

    private FerramentaFactory() {
    }

    private static FerramentaFactory ferramentaFactory;

    public static FerramentaFactory getInstance() {
        if (ferramentaFactory == null) {
            synchronized (FerramentaFactory.class) {
                if (ferramentaFactory == null) {
                    ferramentaFactory = new FerramentaFactory();
                }
            }
        }
        return ferramentaFactory;
    }

    public Ferramenta pegarFerramenta (TipoFerramenta tipoFerramenta) {
        Ferramenta ferramenta;
        switch (tipoFerramenta) {
            case LANTERNA:
                ferramenta = new Lanterna();
                break;
            case MARTELO:
                ferramenta = new Martelo();
                break;
            case TESOURA:
                ferramenta = new Tesoura();
                break;
            default:
                throw new FerramentaInvalidaException();
        }
        return ferramenta;
    }
}


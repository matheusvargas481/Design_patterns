package com.matheussoilegra.coreengineering.tema11;

public class CarreiraFactory {

    public Carreira getCarreira(Especialidades especialidades) {
        switch (especialidades) {
            case PROGRAMACAO:
                return new Programacao();
            case ENFERMAGEM:
                return new Enfermagem();
            case ADVOCACIA:
                return new Advocacia();
            default:
                throw new CarreiraInvalidaException();
        }
    }

}
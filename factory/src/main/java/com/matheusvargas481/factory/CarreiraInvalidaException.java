package com.matheussoilegra.coreengineering.tema11;

public class CarreiraInvalidaException extends RuntimeException {
    public CarreiraInvalidaException() {
        super("Carreira inválida.");
    }
}

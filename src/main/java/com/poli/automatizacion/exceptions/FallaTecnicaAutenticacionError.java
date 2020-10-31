package com.poli.automatizacion.exceptions;

public class FallaTecnicaAutenticacionError extends AssertionError {

    public FallaTecnicaAutenticacionError(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}


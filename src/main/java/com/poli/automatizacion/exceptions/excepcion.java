package com.poli.automatizacion.exceptions;

public class excepcion extends AssertionError {
    public static final String MENSAJE_ERROR = "ERROR en la pagina";


    public excepcion(String message, Throwable cause) {
        super(message, cause);
    }

}

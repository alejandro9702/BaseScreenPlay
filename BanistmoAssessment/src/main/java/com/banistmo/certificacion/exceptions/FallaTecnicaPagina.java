package com.banistmo.certificacion.exceptions;

public class FallaTecnicaPagina extends AssertionError {
    public static final String MENSAJE_ERROR = "ERROR en la pagina";
    public static final String FALLA_ABRIENDO_PDF = "ERROR en la pagina";



    public FallaTecnicaPagina(String message, Throwable cause) {
        super(message, cause);
    }

}

package com.banistmo.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class interaccion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static interaccion conLaPagina() {
        return new interaccion();
    }

}

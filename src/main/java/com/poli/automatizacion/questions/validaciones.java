package com.poli.automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class validaciones implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }

    public static validaciones estanCorrectas() {
        return new validaciones();
    }

}

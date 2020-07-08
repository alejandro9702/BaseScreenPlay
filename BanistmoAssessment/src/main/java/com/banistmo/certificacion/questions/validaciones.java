package com.banistmo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionSubject;

public class validaciones implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }

    public static validaciones estanCorrectas() {
        return new validaciones();
    }

}

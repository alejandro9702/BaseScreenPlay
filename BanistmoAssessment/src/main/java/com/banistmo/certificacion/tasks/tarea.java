package com.banistmo.certificacion.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class tarea implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static tarea conLaSiguienteInformacion(String datos) {
        return instrumented(tarea.class, datos);
    }

}


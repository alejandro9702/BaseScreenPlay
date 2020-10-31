package com.poli.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static CrearUsuario conLaSiguienteInformacion(String datos) {
        return instrumented(CrearUsuario.class, datos);
    }

}


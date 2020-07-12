package com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static BuscarProducto conLaSiguienteInformacion(String datos) {
        return instrumented(BuscarProducto.class, datos);
    }

}


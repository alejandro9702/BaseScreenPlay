package com.poli.automatizacion.tasks;

import com.poli.automatizacion.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.poli.automatizacion.userinterface.Login.*;
import static com.poli.automatizacion.userinterface.UserManagement.*;


public class CrearUsuario implements Task {

    private Usuario usuario;

    public CrearUsuario(Usuario datosUsuario) {
        this.usuario = datosUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MENU_ADMIN.waitingForNoMoreThan(Duration.ofSeconds(20))),
                MoveMouse.to(SUBMENU_USER_MANAGEMENT),
                Click.on(USARIOS)
        );
    }

    public static CrearUsuario conLaSiguienteInformacion(Usuario datosUsuario) {
        return instrumented(CrearUsuario.class, datosUsuario);
    }

}


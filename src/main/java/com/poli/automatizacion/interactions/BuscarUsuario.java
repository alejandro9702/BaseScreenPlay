package com.poli.automatizacion.interactions;

import com.poli.automatizacion.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.poli.automatizacion.userinterface.UserManagement.BUSCAR;
import static com.poli.automatizacion.userinterface.UserManagement.BUSCAR_POR_NOMBRE;

public class BuscarUsuario implements Interaction {
    Usuario usuario;

    public BuscarUsuario(Usuario infoUsuario) {
        this.usuario = infoUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.getNuevoNombreUsuario()).into(BUSCAR_POR_NOMBRE.waitingForNoMoreThan(Duration.ofSeconds(15))),
                Click.on(BUSCAR)
        );
    }

    public static BuscarUsuario conLaInformacion(Usuario usuario) {
        return new BuscarUsuario(usuario);
    }

}

package com.poli.automatizacion.questions;

import com.poli.automatizacion.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.poli.automatizacion.userinterface.UserManagement.*;


public class ValidarUsuarioCreado implements Question {


    Usuario usuario;

    public ValidarUsuarioCreado(Usuario infoUsuario) {
        this.usuario = infoUsuario;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return RESULTADO_BUSQUEDA.of(usuario.getNuevoNombreUsuario()).resolveFor(actor).isVisible();
    }

    public static ValidarUsuarioCreado conLainfromacion(Usuario usuario) {
        return new ValidarUsuarioCreado(usuario);
    }


}

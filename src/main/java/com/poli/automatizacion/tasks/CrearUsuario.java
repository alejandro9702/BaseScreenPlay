package com.poli.automatizacion.tasks;

import com.poli.automatizacion.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.poli.automatizacion.userinterface.UserManagement.*;


public class CrearUsuario implements Task {

    private Usuario usuario;
    private static final String CODIGO= RandomStringUtils.randomAlphanumeric(5);

    public CrearUsuario(Usuario datosUsuario) {
        this.usuario = datosUsuario;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        usuario.setNuevoNombreUsuario(usuario.getNuevoNombreUsuario()+CODIGO);
        actor.attemptsTo(
                MoveMouse.to(MENU_ADMIN.waitingForNoMoreThan(Duration.ofSeconds(20))),
                MoveMouse.to(SUBMENU_USER_MANAGEMENT),
                Click.on(USARIOS),
                Click.on(AGREGAR_USUARIO.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(LISTA_ROLES),
                Click.on(OPCIONES.waitingForNoMoreThan(Duration.ofSeconds(10)).of(usuario.getRol())),
                Enter.theValue(usuario.getNombreEmpleado()).into(NOMBRE_EMPLEADO),
                Enter.theValue(usuario.getNuevoNombreUsuario()).into(NUEVO_USUARIO),
                Click.on(STATUS.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(OPCIONES.of(usuario.getEstado())),
                Enter.theValue(usuario.getNuevaContrasena()).into(CONTRASENA_NUEVO_USUARIO),
                Enter.theValue(usuario.getConfirmarNuevaContrasena()).into(CONFIRMAR_CONTRASENA),
                Click.on(GUARDAR)
        );
    }

    public static CrearUsuario conLaSiguienteInformacion(Usuario datosUsuario) {
        return instrumented(CrearUsuario.class, datosUsuario);
    }

}


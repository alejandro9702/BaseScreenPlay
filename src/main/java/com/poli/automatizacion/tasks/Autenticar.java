package com.poli.automatizacion.tasks;

import com.poli.automatizacion.exceptions.FallaTecnicaAutenticacionError;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static com.poli.automatizacion.userinterface.Login.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class Autenticar implements Task {

    private String nombreUsuario;
    private String contrasena;
    private static final String MENSAJE = "";

    public Autenticar(String usuario, String contrasena) {
        this.nombreUsuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(the(NOMBRE_DE_USUARIO.waitingForNoMoreThan(Duration.ofSeconds(20))), isVisible())
                .orComplainWith(FallaTecnicaAutenticacionError.class, MENSAJE));
        actor.attemptsTo(
                Enter.theValue(nombreUsuario).into(NOMBRE_DE_USUARIO),
                Enter.theValue(contrasena).into(CONTRASENA),
                Click.on(INGRESAR)
                );
    }

    public static Autenticar alUsuario(String usuario, String contrasena) {
        return Tasks.instrumented(Autenticar.class, usuario,contrasena);
    }
}

package com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.banistmo.certificacion.userinterface.PaginaDeProductos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticacion implements Task {
    private List<String> listaProdcutos;

    public Autenticacion(List<String> productosAComprar) {
        this.listaProdcutos = productosAComprar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //BrowseTheWeb.as(actor).getDriver().manage().window().maximize();
        USERNAME.resolveFor(actor).waitUntilClickable().type(usuario.getNombreUsuario());
        actor.attemptsTo(WaitUntil.the(USERNAME, isClickable()),
                SendKeys.of(usuario.getContrasena()).into(PASSWORD).thenHit(Keys.ENTER));
        actor.attemptsTo(Esperar.queDesaparezcaLoader());
    }

    public static Autenticacion conLaSiguienteInformacion(String usuario, String contrasena) {
        return instrumented(Autenticacion.class, usuario, contrasena);
    }

}


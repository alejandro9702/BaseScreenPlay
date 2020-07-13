package com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.banistmo.certificacion.userinterface.PaginaDeProductos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {
    private List<String> listaProdcutos;

    public BuscarProducto(List<String> productosAComprar) {
        this.listaProdcutos = productosAComprar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        listaProdcutos.forEach(
                producto -> {
                    System.out.println(producto);
                    System.out.println(producto.toString());
                    actor.attemptsTo(
                            Scroll.to(PRODUCTO_A_COMPRAR.of(producto).waitingForNoMoreThan(Duration.ofSeconds(10))),
                            Click.on(PRODUCTO_A_COMPRAR.of(producto)),
                            Click.on(AGREGAR_PRODUCTO.waitingForNoMoreThan(Duration.ofSeconds(10)))
                            );
                    WebDriverWait wait = new WebDriverWait( BrowseTheWeb.as(actor).getDriver(), 2);
                    wait.until(ExpectedConditions.alertIsPresent());
                    BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
                    actor.attemptsTo(
                            Click.on(PAGINA_PRINCIPAL.waitingForNoMoreThan(Duration.ofSeconds(10)))
                    );
                }
        );
        actor.attemptsTo(
                Click.on(CARRO_DE_COMPRAS)
        );
    }

    public static BuscarProducto conLaSiguienteInformacion(List<String> productos) {
        return instrumented(BuscarProducto.class, productos);
    }

}


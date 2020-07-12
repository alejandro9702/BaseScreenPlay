package com.banistmo.certificacion.stepdefinitions;

import com.banistmo.certificacion.userinterface.Pagina;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PruebaStepDefinitions {

    private Pagina pagina;
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Dado("^que el usuario ingrese y busque un producto$")
    public void queElUsuarioIngreseYBusqueUnProducto() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }

    @Cuando("^y lo agruegue al carro de compras$")
    public void yLoAgruegueAlCarroDeCompras() {

    }

    @Entonces("^deberia verlo en el resumen de su compra$")
    public void deberiaVerloEnElResumenDeSuCompra() {

    }


}

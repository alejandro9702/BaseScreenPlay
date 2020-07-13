package com.banistmo.certificacion.stepdefinitions;

import com.banistmo.certificacion.tasks.Autenticacion;
import com.banistmo.certificacion.tasks.BuscarProducto;
import com.banistmo.certificacion.userinterface.PaginaDeProductos;
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

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaStepDefinitions {

    private PaginaDeProductos pagina;
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Dado("^que el usuario ingrese a la pagina de compras$")
    public void queElUsuarioIngreseALaPaginaDeCompras() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );    }

    @Dado("^que el usuario ingrese y se autentique$")
    public void queElUsuarioIngreseYSeAutentique() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina),
                Autenticacion.conLaSiguienteInformacion("dd","")
        );    }


    @Cuando("^agregue los productos al carro de compras:$")
    public void agregueLosProductosAlCarroDeCompras(List<String> productos) {
        theActorInTheSpotlight().attemptsTo(
                BuscarProducto.conLaSiguienteInformacion(productos)
        );
    }

    @Entonces("^deberia verlo en el resumen de su compra$")
    public void deberiaVerloEnElResumenDeSuCompra() {

    }


}

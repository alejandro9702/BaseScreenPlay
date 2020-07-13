package com.banistmo.certificacion.stepdefinitions;

import com.banistmo.certificacion.exceptions.FallaTecnicaPagina;
import com.banistmo.certificacion.questions.ValidarPDF;
import com.banistmo.certificacion.tasks.VisualizarTarifario;
import com.banistmo.certificacion.userinterface.PaginaBanistmo;
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

import static com.banistmo.certificacion.exceptions.FallaTecnicaPagina.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PruebaStepDefinitions {

    private PaginaBanistmo pagina;
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }


    @Dado("^que el usuario ingrese a la pagina de banistmo$")
    public void queElUsuarioIngreseALaPaginaDeBanistmo() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }

    @Cuando("^ingrese a la seccion de tarifario y abra el pdf de (.*)$")
    public void ingreseALaSeccionDeTarifarioYAbraElPdfDeTarifasDeCuentasDeDepósitos(String nombreDocumento) {
        theActorInTheSpotlight().attemptsTo(
                VisualizarTarifario.conLaSiguienteInformacion(nombreDocumento)
        );
    }

    @Entonces("^deberia ver el pdf abierto en una nueva pestaña$")
    public void deberiaVerElPdfAbiertoEnUnaNuevaPestaña() {
        theActorInTheSpotlight().should(seeThat(ValidarPDF.sePuedeVisualizar()).orComplainWith(FallaTecnicaPagina.class, FALLA_ABRIENDO_PDF));
    }


}

package com.poli.automatizacion.stepdefinitions;

import com.poli.automatizacion.models.Usuario;
import com.poli.automatizacion.tasks.Autenticar;
import com.poli.automatizacion.tasks.CrearUsuario;
import com.poli.automatizacion.userinterface.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
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

    private Login pagina;
    private Usuario infoNuevoUsuario;
    private static final String MENSAJE = "Sistema no disponible";
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Dado("^que el usuario ingrese a orangeHRM con el usuario (.*) y contrasena (.*) e ingrese al control de usuarios$")
    public void queElUsuarioIngreseAOrangeHRMConElUsuarioTalYContrasenaTalEIngreseAlControlDeUsuarios(String nombreUsuario, String contrasena) {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina),
                Autenticar.alUsuario(nombreUsuario, contrasena)
        );
    }

    @Cuando("^cree un usuario$")
    public void creeUnUsuario(List<Usuario> usuario) {
        infoNuevoUsuario = usuario.get(0);
        theActorInTheSpotlight().attemptsTo(
                CrearUsuario.conLaSiguienteInformacion(infoNuevoUsuario)
        );
    }

    @Entonces("^deberia verlo en la lista de usuarios$")
    public void deberiaVerloEnLaListaDeUsuarios() {
    }

    @Y("^luego debe poder borrarlo$")
    public void luegoDebePoderBorrarlo() {
    }


}

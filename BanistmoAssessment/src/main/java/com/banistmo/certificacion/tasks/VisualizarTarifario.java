package com.banistmo.certificacion.tasks;

import com.banistmo.certificacion.exceptions.FallaTecnicaPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;

import static com.banistmo.certificacion.exceptions.FallaTecnicaPagina.*;
import static com.banistmo.certificacion.userinterface.PaginaBanistmo.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class VisualizarTarifario implements Task {
    private String nombreDeDocumento;

    public VisualizarTarifario(String documento) {
        this.nombreDeDocumento = documento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(the(LOGO_BANISTMO.waitingForNoMoreThan(Duration.ofSeconds(20))), isVisible())
                .orComplainWith(FallaTecnicaPagina.class, MENSAJE_ERROR));
        actor.attemptsTo(
                Scroll.to(SECCION_TARIFARIO),
                Click.on(SECCION_TARIFARIO),
                Click.on(DOCUMENTOS.of(nombreDeDocumento).waitingForNoMoreThan(Duration.ofSeconds(20)))
        );
        ArrayList<String> tabs = new ArrayList<String>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(tabs.get(1));
    }

    public static VisualizarTarifario conLaSiguienteInformacion(String documento) {
        return instrumented(VisualizarTarifario.class, documento);
    }

}


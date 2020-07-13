package com.banistmo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidarPDF implements Question<Boolean> {
    public static final String URL_PDF="https://www.banistmo.com/wps/wcm/connect/aae1f540-6e90-4974-a27b-b8867a5fd2c9/S56_ActualizacionTarifarioDepositos_Dic2019+%281%29+%282%29.pdf?MOD=AJPERES&CVID=n8g171g";
    @Override
    public Boolean answeredBy(Actor actor) {
        String url=  BrowseTheWeb.as(actor).getDriver().getCurrentUrl().toString();
        return url.contains(URL_PDF);
    }

    public static ValidarPDF sePuedeVisualizar() {
        return new ValidarPDF();
    }

}

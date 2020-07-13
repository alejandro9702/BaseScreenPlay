package com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaBanistmo extends PageObject {
    public static final Target SECCION_TARIFARIO = Target.the("input de busqueda").locatedBy("//a[text()='Tarifario']");
    public static final Target LOGO_BANISTMO = Target.the("logo banistmo").locatedBy("(//img[@id='logoFilial'])[2]");
    public static final Target DOCUMENTOS = Target.the("documento del tarifario").locatedBy("(//span[contains(text(),'{0}')]//following::a//img)[1]");



}

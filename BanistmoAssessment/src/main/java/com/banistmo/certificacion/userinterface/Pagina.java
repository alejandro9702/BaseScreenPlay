package com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.tiendasmetro.co/")
public class Pagina extends PageObject {
    public static final Target BUSQUEDA = Target.the("input de busqueda").located(By.name("/buscar/#/search/"));
    public static final Target BOTON_BUCAR = Target.the("Boton buscar").located(By.xpath(""));


}

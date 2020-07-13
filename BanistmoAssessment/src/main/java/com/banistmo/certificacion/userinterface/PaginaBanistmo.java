package com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.demoblaze.com/index.html")
public class PaginaBanistmo extends PageObject {
    public static final Target BUSQUEDA = Target.the("input de busqueda").located(By.name("/buscar/#/search/"));
    public static final Target BOTON_BUCAR = Target.the("Boton buscar").located(By.xpath(""));
    public static final Target CATEGORIA_CELULARES = Target.the("categoria celulares").located(By.xpath("//a[text()='Phones']"));
    public static final Target CATEGORIA_LAPTOS = Target.the("categoria laptos").located(By.xpath("//a[text()='Laptops']"));
    public static final Target CATEGORIA_MONITORES = Target.the("categoria Monitores").located(By.xpath("//a[text()='Monitors']"));
    public static final Target PRODUCTO_A_COMPRAR = Target.the("seleccionar producto").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target AGREGAR_PRODUCTO = Target.the("AGREGAR PRODCUTO").locatedBy("//a[contains(text(),'Add to cart')]");
    public static final Target PAGINA_PRINCIPAL = Target.the("AGREGAR PRODCUTO").locatedBy("//a[contains(text(),'Home')]");
    public static final Target CARRO_DE_COMPRAS = Target.the("AGREGAR PRODCUTO").locatedBy("//a[contains(text(),'Cart')]");



}

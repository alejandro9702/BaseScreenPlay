package com.poli.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser")
public class Login extends PageObject {
    public static final Target NOMBRE_DE_USUARIO = Target.the("input de nombre de usuario").located(By.xpath("//input[@id='txtUsername']"));
    public static final Target CONTRASENA = Target.the("input de contraseña").located(By.xpath("//input[@id='txtPassword']"));
    public static final Target INGRESAR = Target.the("boton ingresar").located(By.xpath("//input[@id='btnLogin']"));


}

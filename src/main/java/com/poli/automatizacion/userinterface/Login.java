package com.poli.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser")
public class Login extends PageObject {
    public static final Target NOMBRE_DE_USUARIO = Target.the("input de nombre de usuario").located(By.name("//input[@id='txtUsername']"));
    public static final Target CONTRASEÑA = Target.the("input de contraseña").located(By.xpath("//input[@id='txtPassword']"));


}

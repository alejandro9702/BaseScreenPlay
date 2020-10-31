package com.poli.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class UserManagement extends PageObject {
    public static final Target MENU_ADMIN = Target.the("seccion admin").located(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
    public static final Target SUBMENU_USER_MANAGEMENT = Target.the("control de usuarios").located(By.xpath("//a[@id='menu_admin_UserManagement']"));
    public static final Target USARIOS = Target.the("boton agregar usuario").located(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
    public static final Target AGREGAR_USUARIO = Target.the("boton agregar usuario").located(By.xpath("//input[@id='btnAdd']"));

}

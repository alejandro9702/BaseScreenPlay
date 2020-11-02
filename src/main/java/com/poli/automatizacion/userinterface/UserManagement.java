package com.poli.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class UserManagement extends PageObject {
    public static final Target MENU_ADMIN = Target.the("seccion admin").located(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
    public static final Target SUBMENU_USER_MANAGEMENT = Target.the("control de usuarios").located(By.xpath("//a[@id='menu_admin_UserManagement']"));
    public static final Target USARIOS = Target.the("sub menu usuarios").located(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
    public static final Target AGREGAR_USUARIO = Target.the("boton agregar usuario").located(By.xpath("//input[@id='btnAdd']"));
    public static final Target LISTA_ROLES = Target.the("lista de roles").locatedBy("//select[@id='systemUser_userType']");
    public static final Target NOMBRE_EMPLEADO = Target.the("input nuevo usuario").located(By.xpath("//input[@id='systemUser_employeeName_empName']"));
    public static final Target NUEVO_USUARIO = Target.the("input nuevo usuario").located(By.xpath("//input[@id='systemUser_userName']"));
    public static final Target STATUS = Target.the("lista status").located(By.xpath("//select[@id='systemUser_status']"));
    public static final Target OPCIONES = Target.the("opciones status").locatedBy("//option[text()='{0}']");
    public static final Target CONTRASENA_NUEVO_USUARIO = Target.the("input contraseña nueva").located(By.xpath("//input[@id='systemUser_password']"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("input confirmar contraseña").located(By.xpath("//input[@id='systemUser_confirmPassword']"));
    public static final Target GUARDAR = Target.the("BOTON GUARDAR").located(By.xpath("//input[@id='btnSave']"));
    public static final Target BUSCAR_POR_NOMBRE = Target.the("boton buscar").locatedBy("//input[@id='searchSystemUser_userName']");
    public static final Target BUSCAR = Target.the("BOTON ELIMINAR").located(By.xpath("//input[@id='searchBtn']"));
    public static final Target ELIMINAR = Target.the("BOTON GUARDAR").located(By.xpath("//input[@id='btnDelete']"));
    public static final Target CONFIRMAR_ELIMINAR = Target.the("ok confirmar eliminar").located(By.xpath("//input[@id='dialogDeleteBtn']"));
    public static final Target MODAL_ELIMINAR_USUARIO = Target.the("modal eliminar usuario").located(By.xpath("//div[@id='deleteConfModal']//h3[contains(text(),'OrangeHRM - Confirmation Required')]"));
    public static final Target RESULTADO_BUSQUEDA = Target.the("primer resultado busqueda").locatedBy("//table[@id='resultTable']//td//a[text()='{0}']");
    public static final Target BUSQUEDA_SIN_RESULTADOS = Target.the("Busqueda sin resultados").locatedBy("//td[contains(text(),'No Records Found')]");


}

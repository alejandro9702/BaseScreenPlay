package com.poli.automatizacion.tasks;

import com.poli.automatizacion.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.poli.automatizacion.userinterface.UserManagement.*;

public class EliminarUsuario implements Task {
    Usuario usuario;
    private static final Target CHECKBOX_RESULTADO_BUSQUEDA = Target.the("primer checkbox resultado busqueda")
            .locatedBy("//a[text()='{0}']//preceding::td//input[@type='checkbox']");


    public EliminarUsuario(Usuario infoUsuario) {
        this.usuario = infoUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKBOX_RESULTADO_BUSQUEDA.of(usuario.getNuevoNombreUsuario())),
                Click.on(ELIMINAR),
                Click.on(CONFIRMAR_ELIMINAR)
        );

    }

    public static EliminarUsuario conLaSiguienteInformacion(Usuario infoUsuario) {
        return instrumented(EliminarUsuario.class, infoUsuario);
    }


}

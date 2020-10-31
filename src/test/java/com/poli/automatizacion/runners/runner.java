package com.poli.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = {"com/poli/automatizacion/stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class runner {


}

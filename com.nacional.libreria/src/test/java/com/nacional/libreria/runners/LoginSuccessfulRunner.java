package com.nacional.libreria.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.nacional.libreria.features"
        , glue = "com.nacional.libreria.stepdefinitions"
        , snippets = SnippetType.CAMELCASE
        ,tags = "@Test_Successful"
)
public class LoginSuccessfulRunner {
}

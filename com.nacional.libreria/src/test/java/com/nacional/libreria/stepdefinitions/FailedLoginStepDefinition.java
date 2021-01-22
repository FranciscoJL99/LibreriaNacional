package com.nacional.libreria.stepdefinitions;

import com.libreria.nacional.exceptions.ResultNotWaited;
import com.libreria.nacional.questions.DataMesssage;
import com.libreria.nacional.questions.HomePage;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import static com.nacional.libreria.stepdefinitions.LoginSuccessfulStepDefinition.*;

public class FailedLoginStepDefinition {

    @Then("^it should generate error message$")
    public void itShouldGenerateErrorMessage() {
        actor.should(GivenWhenThen.seeThat(
                DataMesssage.isVisible(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.INCORRECT_DATA_MESSAGE)
        );
    }

}

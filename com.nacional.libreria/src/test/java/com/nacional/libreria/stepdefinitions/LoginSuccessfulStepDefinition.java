package com.nacional.libreria.stepdefinitions;

import com.libreria.nacional.exceptions.ResultNotWaited;
import com.libreria.nacional.models.TestData;
import com.libreria.nacional.questions.BookName;
import com.libreria.nacional.questions.ContainerPage;
import com.libreria.nacional.questions.HomePage;
import com.libreria.nacional.tasks.Login;
import com.libreria.nacional.tasks.Search;
import com.libreria.nacional.userinterfaces.PageLibreriaNacional;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginSuccessfulStepDefinition {

    @Managed(driver = "chrome")
    public static WebDriver browser;
    public static Actor actor = Actor.named("Actor");

    public void abrirNavegador() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(new PageLibreriaNacional()));
    }

    @Given("^that the User want do login in the application$")
    public void thatTheUserWantDoLoginInTheApplication() {
        abrirNavegador();
        actor.should(GivenWhenThen.seeThat(
                ContainerPage.isVisible(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.CONTAINER_PAGE_FAILER)
        );
    }

    @When("^he enter credentials$")
    public void heEnterCredentials(List<TestData> testData) {
        actor.attemptsTo(
                Login.inLibreriaNacional(testData.get(0))
        );
    }

    @Then("^he must access the homepage$")
    public void heMustAccessTheHomepage() {
        actor.should(GivenWhenThen.seeThat(
                HomePage.isVisible(), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.HOME_PAGE_FAILER)
        );
    }

    @And("^search a book$")
    public void searchABook(List<TestData> testData) {
        actor.attemptsTo(
                Search.book(testData.get(0))
        );
        actor.should(GivenWhenThen.seeThat(
                BookName.validation(testData.get(0)), Matchers.equalTo(true)).orComplainWith(ResultNotWaited.class, ResultNotWaited.HOME_PAGE_FAILER)
        );
    }
}

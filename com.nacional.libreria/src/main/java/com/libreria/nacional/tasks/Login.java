package com.libreria.nacional.tasks;

import com.libreria.nacional.models.TestData;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.junit.Test;

import static com.libreria.nacional.userinterfaces.PageLibreriaNacional.*;

public class Login implements Task {

    private String user;
    private String password;

    public Login(TestData testData) {
        this.user = testData.getUser();
        this.password = testData.getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MY_ACCOUNT),
                Click.on(LOGIN),
                Click.on(LOGIN_EMAIL_PASSWORD),
                Enter.theValue(user).into(EMAIL),
                Enter.theValue(password).into(PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Performable inLibreriaNacional(TestData testData) {
        return Tasks.instrumented(Login.class, testData);
    }
}

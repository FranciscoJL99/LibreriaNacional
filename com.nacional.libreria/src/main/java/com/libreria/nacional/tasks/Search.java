package com.libreria.nacional.tasks;

import com.libreria.nacional.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.libreria.nacional.userinterfaces.PageLibreriaNacional.*;

public class Search implements Task {
    private final String book;

    public Search(TestData testData) {
        this.book = testData.getBook();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(book).into(SEARCH),
                Hit.the(Keys.ENTER).into(SEARCH),
                Click.on(BOOK(book))
        );
    }

    public static Performable book(TestData testData) {
        return Tasks.instrumented(Search.class, testData);
    }
}

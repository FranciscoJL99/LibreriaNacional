package com.libreria.nacional.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.libreria.nacional.userinterfaces.PageLibreriaNacional.INCORRECT_DATA_MESSAGE;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class DataMesssage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(INCORRECT_DATA_MESSAGE).answeredBy(actor).isVisible();
    }

    public static DataMesssage isVisible() {
        return new DataMesssage();
    }
}
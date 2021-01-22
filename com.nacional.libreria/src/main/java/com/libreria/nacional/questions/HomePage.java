package com.libreria.nacional.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.libreria.nacional.userinterfaces.PageLibreriaNacional.WELCOME_MENSSAGE;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class HomePage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(WELCOME_MENSSAGE).answeredBy(actor).isVisible();
    }

    public static HomePage isVisible() {
        return new HomePage();
    }
}
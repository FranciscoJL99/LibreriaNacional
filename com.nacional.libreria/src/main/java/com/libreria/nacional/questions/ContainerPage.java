package com.libreria.nacional.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.libreria.nacional.userinterfaces.PageLibreriaNacional.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ContainerPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
           return the(CONTAINER_PAGE).answeredBy(actor).isVisible();
    }

    public static ContainerPage isVisible() {
        return new ContainerPage();
    }
}

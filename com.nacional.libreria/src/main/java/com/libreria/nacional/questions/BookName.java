package com.libreria.nacional.questions;

import com.libreria.nacional.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.libreria.nacional.userinterfaces.PageLibreriaNacional.*;

public class BookName implements Question<Boolean> {

    TestData nameBook;

    private BookName(TestData nameBook){
        this.nameBook = nameBook;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return (Text.of(NAME_BOOK)
                .viewedBy(actor)
                .asString().equals(nameBook.getBook()));
    }

    public static BookName validation(TestData nameBook) {
        return new BookName(nameBook);
    }
}
package com.libreria.nacional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static com.libreria.nacional.utils.Constants.URL;

@DefaultUrl(value = URL)
public class PageLibreriaNacional extends PageObject {

    public static final Target MY_ACCOUNT = Target.the("Login menu").located(By.xpath("/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/button[1]"));
    public static final Target LOGIN = Target.the("Login in page").located(By.xpath("/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
    public static final Target EMAIL = Target.the("Email of user").located(By.name("usuario"));
    public static final Target PASSWORD = Target.the("Passwor of user in page").located(By.name("contrasena"));
    public static final Target SEARCH = Target.the("Passwor of user in page").located(By.xpath("/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[2]"));


    public static final Target BTN_LOGIN = Target.the("Button login in page").located(By.tagName("button"));


    public static final Target CONTAINER_PAGE = Target.the("Containet Page").located(By.xpath("//*[contains(@class, 'row mx-0 py-lg-2 justify-content-between')]"));
    public static final Target LOGIN_EMAIL_PASSWORD = Target.the("Login optin with Email and password").located(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/app-ingreso[1]/div[1]/div[2]/div[1]/div[5]/a[1]/div[1]/div[1]"));
    public static final Target INCORRECT_DATA_MESSAGE = Target.the("Incorrect data menssage in login").located(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/app-iniciar-sesion[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]"));
    public static final Target WELCOME_MENSSAGE = Target.the("Welcome message in home page").located(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-mi-cuenta[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    public static final Target NAME_BOOK = Target.the("Name book seartch").located(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-libro[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h1[1]"));


    public static Target BOOK(String book){
        return Target.the("book search result").located(By.xpath("//*[contains(text(), '"+ book + "')][position()=1]"));
    }
}

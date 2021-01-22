package com.libreria.nacional.exceptions;

public class ResultNotWaited extends AssertionError{

    public static final String CONTAINER_PAGE_FAILER = "You have not loaded the page, check the status of the portal or internet";
    public static final String HOME_PAGE_FAILER = "The homepage of the page is not as expected";
    public static final String INCORRECT_DATA_MESSAGE = "The error message is as expected\n";

       public ResultNotWaited(String message,Throwable cause) {
        super(message,cause);
    }

}

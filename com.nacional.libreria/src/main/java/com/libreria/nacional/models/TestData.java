package com.libreria.nacional.models;

public class TestData {

    private String user;
    private String password;
    private String book;

    public TestData(String user, String password, String book){
        this.user = user;
        this.password = password;
        this.book = book;
    }

    public String getUser(){return user;}

    public String getPassword(){return password;}

    public String getBook(){return book;}
}

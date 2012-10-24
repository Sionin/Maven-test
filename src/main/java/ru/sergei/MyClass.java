
package ru.sergei;

public class MyClass {

/*===========================================[ STATIC VARIABLES ]===============*/

    public static final String MESSAGE = "Hello world!";
    public static final String LONG_MESSAGE = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
    public static final String SUFFIX = " (c)";

/*===========================================[ INSTANCE VARIABLES ]=============*/

/*===========================================[ CONSTRUCTORS ]===================*/

/*===========================================[ CLASS METHODS ]==================*/

    public String getLongMessage(){
        return LONG_MESSAGE;
    }

    public String getMessage() {
        return MESSAGE + SUFFIX;
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.getMessage());
    }

}

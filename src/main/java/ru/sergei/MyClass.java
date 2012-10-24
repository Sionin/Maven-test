
package ru.sergei;

public class MyClass {

/*===========================================[ STATIC VARIABLES ]===============*/

    public static final String MESSAGE = "Hello world!";
    public static final String SUFFIX = " (c)";

/*===========================================[ INSTANCE VARIABLES ]=============*/

/*===========================================[ CONSTRUCTORS ]===================*/

/*===========================================[ CLASS METHODS ]==================*/


    public String getMessage() {
        return MESSAGE + SUFFIX;
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.getMessage());
    }

}

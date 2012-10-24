
package ru.sergei;

public class MyClass {

/*===========================================[ STATIC VARIABLES ]===============*/

    public static final String SUFFIX = " (c)";
    public static final String MESSAGE = "Hello world!" + SUFFIX;

/*===========================================[ INSTANCE VARIABLES ]=============*/

/*===========================================[ CONSTRUCTORS ]===================*/

/*===========================================[ CLASS METHODS ]==================*/


    public String getMessage() {
        return MESSAGE;
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.getMessage());
    }

}

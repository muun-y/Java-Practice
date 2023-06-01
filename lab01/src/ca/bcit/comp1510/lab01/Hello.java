package ca.bcit.comp1510.lab01;

/**
 * Prints a Hello message. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class Hello {

    /**
     * 
     * @param args
     * 		unused
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

}

/*
a. Error: Could not find or load main class ca.bcit.comp1510.lab01.Hello 
in module Comp1510Lab01MunyoungC
b. inside string is information provided to the method 
so misspell can be ignored. 
"Hello world!" is changed to "Helo world!" 
c. Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    String literal is not properly closed by a double-quote
    at Comp1510Lab01MunyoungC/ca.bcit.comp1510.lab01.Hello.main(Hello.java:17)
d. 4 errors
e. Syntax error, insert ";" to complete BlockStatements 
at Comp1510Lab01MunyoungC/ca.bcit.comp1510.lab01.Hello.main(Hello.java:17)
 */
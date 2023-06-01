package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * COMP1510 Programming Methods.
 * @author Munyoung cho
 * @version 2023
 */

public class FunWithStrings {
    /**
     * Drives 'FunWithStrings program. 
     * @param args unused
     */
    public static void main(String[] args) {
        // 3.
        Scanner scan = new Scanner(System.in);
        // 4.
        String userInput;
        // 5.
        System.out.println("Enter title of your favourite book: ");
        // 8.
        userInput = scan.nextLine();
        
        //9. 
        System.out.println("Your favourite book is "
                + userInput + " . ");

        // 10. Challenge Questions 
        //userInput = scan.next(); 
        //It is only working 
        //when users enter the text which don't include space.
        //"next" 
        
        
        //12. 
        System.out.println("The book's title is " + userInput.length()
                + " character(s) long");
        
        //13. 
        System.out.println("Does the title of the book start "
                + "with the word \" The \"? " + userInput.startsWith("The"));
        
        //14. same result 
        userInput.toUpperCase(); 
        System.out.println("Question14: " + userInput);
        
        //15. it works, 
        String newUserInput = userInput.toUpperCase();
        System.out.println("Question 15: " + newUserInput);
        
        //16.
        //The "String" object is immutable,
        //so "toUpperCase" method doesn't change the object.
        //It still print the original user input value in question 14.
        
        //17.
        System.out.println("Upper case of the book's title: " 
                + userInput.toUpperCase());
        System.out.println("Lower case of the book's title: " 
                + userInput.toLowerCase());
        
        //18.
        String trimmedUserInput = userInput.trim(); 
        System.out.println("The length of trimmedUserInput variable is " 
                + trimmedUserInput.length());
        
        //a. If enter only tabs,
        //   it shows an error when print the original String
        //   because the userInput is null,
        //   and the length is 0.
        //b. If enter only spaces,
        //   it shows nothing when print the trimmed String
        //   because the trimmed String has nothing
        //   and the length is 0.
        //c. If enter spaces, then a work, then spaces,
        //   there is no error,
        //   and the length of trimmed String is 
        //   total length minute the length of spaces.
        //d. If enter spaces, then some words, then more spaces,
        //   there is no error,
        //   and the length of trimmed String is 
        //   total length minute the length of spaces,
        //   but it includes the spaces between words.
       
        //19.
        System.out.println("user typed: " + userInput);
        System.out.println("fully trimmed: " + userInput.trim());
        System.out.println("in lower case:" + userInput.toLowerCase());
        System.out.println("with the first and last letters capitalized: " 
                + userInput.substring(0, 1).toUpperCase()
                + userInput.substring(1, userInput.length() - 1)
                + userInput.substring(userInput.length() - 1,
                userInput.length()).toUpperCase());
        
        scan.close();

    }

}

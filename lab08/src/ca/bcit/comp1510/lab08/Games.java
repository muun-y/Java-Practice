package ca.bcit.comp1510.lab08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This is the Games class. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class Games {
    /**
     * Create private instance userScore. 
     */
    private int userScore; 
    
    /**
     * Create private instance a Scanner object. 
     */
    private Scanner scanner;
    
    /**
     * Create private instance a Random object. 
     */
    private Random random; 
    
    /**
     * Create a constructor for Games class. 
     */
    public Games() { 
        userScore = 0; 
        scanner = new Scanner(System.in); 
        random = new Random(); 
    }
    
    
    /**
     * Create public method play. 
     */
    public void play() {
        final int three = 3; 
        final int four = 4; 
        while (true) {
            System.out.println("Welcome to the Games Program!"
                    + "\nMake your choice(enter a number)");
            System.out.println("1.See your score \n2.Guess a number"
                    + "\n3.Play Rock, Paper, Scissors\n4.Quit\n>");

            int input = scanner.nextInt(); 

            if (input == 1) {
                System.out.println("Your score is " + userScore);
            } else if (input == 2) {
                guessANumber();
            } else if (input == three) {
                rockPaperScissors();
            } else if (input == four) {
                return; 
            } else {
                System.out.println("That's not a valid choice!");
            }
        }
    }

    /**
     * Create public method guessANumber. 
     */
    public void guessANumber() {
        final int hundredOne = 101; 
        final int five = 5; 
        System.out.println("I've picked a random number between 0 and 100"
                + "\nCan you guess it?");
        random = new Random(); 
        scanner = new Scanner(System.in); 

        int randomNumber = random.nextInt(hundredOne); 
        int numGuess = 0; 

        while (true) {
            System.out.println("Guess the number!");

            int guess = scanner.nextInt(); 
            numGuess++;
            if (guess == randomNumber) {
                System.out.println("RIGHT!");
                if (numGuess <= five) {
                    System.out.println("Five points!");
                    userScore += five;
                } else {
                    break; 
                }
                return; 
            } else if (guess < randomNumber) {
                System.out.println("Too low, guess again!");
            } else {
                System.out.println("Too high, guess again!");
            }
        }
        

    }
    
    /**
     * Create public method rockPaperScissors. 
     */
    public void rockPaperScissors() {
        final int three = 3; 
        final int five = 5; 
        
        String[] choices = {"rock", "paper", "scissors"};
        int computerChoice = random.nextInt(three);

        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS"
                + "\nWhich one do you choose?");

        while (true) {
            String userChoice = scanner.next().toLowerCase();

            if (!Arrays.asList(choices).contains(userChoice)) {
                System.out.println("That's not a valid choice! Try again!");
            } else {
                int userChoiceIndex = Arrays.asList(choices).
                        indexOf(userChoice);

                if (userChoiceIndex == computerChoice) {
                    System.out.println("Tie!");
                } else if ((userChoiceIndex - computerChoice 
                        + three) % three == 1) {
                    System.out.println("Nope, I picked " 
                        + choices[computerChoice]);
                    userScore -= three;
                } else {
                    System.out.println("Yes! " 
                        + userChoice.substring(0, 1).toUpperCase() 
                            + userChoice.substring(1) 
                            + " " + (userChoiceIndex == 0 ? "smashes" : "cuts") 
                            + " " + choices[(userChoiceIndex + 1) % three]);
                    userScore += five;
                }
                return;
            }
        } 
    }
    
}



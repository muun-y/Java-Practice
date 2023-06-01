package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Driver class for Shopping and Item. 
 * 
 * @author Munyoung cho
 * @version 2022
 */
public class Shopping {
    
    /**
     * A main method to drive the program. 
     * @param args unused
     */
    public static void main(String[] args) {
        final int five = 5; 
        Scanner input = new Scanner(System.in);
        
        // Create a new transaction with a cart size of 5
        Transaction transaction = new Transaction(five);
        
        // Loop to ask user to buy things
        while (true) {
            System.out.print("Enter the name of the item you "
                    + "want to buy (or 'done' to exit): ");
            String name = input.nextLine();
            
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            
            System.out.print("Enter the price of the item: ");
            double price = input.nextDouble();
            input.nextLine(); 
            
            System.out.print("Enter the quantity of the item: ");
            int quantity = input.nextInt();
            input.nextLine(); 
            
            // Create a new item and add it to the transaction
            Item item = new Item(name, price, quantity);
            transaction.addToCart(item);
            System.out.println("Added " + item + " to the cart."); 
        }
        
        // Print the contents of the transaction
        System.out.println(transaction);
        System.out.println("Total Price: $" + transaction.getTotalPrice());
        System.out.println("Total Count: " + transaction.getCount());
        input.close();
    }

    

}

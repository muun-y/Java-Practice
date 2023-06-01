package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * Driver class for CatHotel. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class CatHotelDriver {
    
    /**
     * Declare the constant variable 10. 
     */
    public static final int TEN = 10; 
    
    /**
     * Declare the constant variable 11. 
     */
    public static final int ELEVEN = 11; 
    
    /**
     * Declare the constant variable 15. 
     */
    public static final int FIFTEEN = 15;
    
    /**
     * Declare the constant variable 5. 
     */
    public static final int FIVE = 5; 
    
    /**
     * Main method to drive the Cat class. 
     * @param args unused
     */
    public static void main(String[] args) {
        CatHotel hotel = new CatHotel("Cat's palace"); 
        Random random = new Random(); 
        
        
        for (int i = 1; i <= TEN; i++) {
            int age = random.nextInt(TEN) + 1;
            Cat cat = new Cat("Cat " + i, age);
            hotel.addCat(cat);
        }

        // Print the guest count and list all the guests
        System.out.println("Guest count: " + hotel.guestCount());
        hotel.printGuestList();

        // Remove all guests and print the guest count again
        hotel.removeAllGuests();
        System.out.println("Guest count after removing all guests: " 
            + hotel.guestCount());

        // Add 5 more cats with random ages between 1 and 10
        for (int i = ELEVEN; i <= FIFTEEN; i++) {
            int age = random.nextInt(TEN) + 1;
            Cat cat = new Cat("Cat " + i, age);
            hotel.addCat(cat);
        }

        // Print the guest count and list all the guests again
        System.out.println("Guest count: " + hotel.guestCount());
        hotel.printGuestList();

        // Remove cats older than 5 years and print the guest count and list
        hotel.removeOldGuests(TEN);
        System.out.println("Guest count after removing old guests: " 
            + hotel.guestCount());
        hotel.printGuestList();
    }

}

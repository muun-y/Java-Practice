package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CatHotel class includes addCat, guestCount, removeAllGuests, 
 * guestCount, removeOldGuests method. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class CatHotel {
    /**
     * Declare the instance variable the string for the hotel's name. 
     */
    private final String nameOfHotel;
    
    /**
     *  Declare the ArrayList Cat to store the guests. 
     */
    private final ArrayList<Cat> guests; 
    
    /**
     * Constructor that instantiate the ArrayList of Cat. 
     * @param nameOfHotel
     *        as a String type. 
     */
    public CatHotel(String nameOfHotel) {
        this.nameOfHotel = nameOfHotel; 
        guests = new ArrayList<>(); 
    }
    
    /**
     * Method that adds the Cat to the ArrayList of guests.
     * @param cat
     *         in Cat class. 
     */
    public void addCat(Cat cat) {
        guests.add(cat); 
    }
    
    /**
     * Method that remove all the guests from the hotel. 
     */
    public void removeAllGuests() {
        guests.clear();
    }
    
    /**
     * Method that count number of guests currently in the CatHotel.
     * @return the total number in guests array
     */
    public int guestCount() {
        int total = guests.size(); 
        return total; 
    }
    
    /**
     * Method that check the guest age and remove the old guests. 
     * @param ageLimit 
     *          as an integer
     */
    public void removeOldGuests(int ageLimit) {
        Iterator<Cat> catIterator = guests.iterator(); 
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next(); 
            if (temp.getAge() > ageLimit) {
                catIterator.remove();
            }
        }
    }
    
    /**
     *  Method that print the all the guest in the list.   
     */
    public void printGuestList() {
        System.out.println("Print the name of CatHotel is " + nameOfHotel); 
        for (Cat cat : guests) {
            System.out.println(cat.toString());
        }
    
    }

}

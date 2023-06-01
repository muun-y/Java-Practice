package ca.bcit.comp1510.lab11;

/**
 * Create class for item price and quantity. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Item {
    /**
     * Create instance variable itemName.
     */
    private final String itemName; 
    
    /**
     * Create instance variable price.
     */
    private final double price; 
    
    /**
     * Create instance variable quantity.
     */
    private final int quantity; 
    
    /**
     * Create constructor Item. 
     * @param itemName as a String type
     * @param price as a double type
     * @param quantity as an integer type
     */
    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    /**
     * Create overloaded constructor. 
     * @param itemName as a String type
     * @param price as double type
     */
    public Item(String itemName, double price) {
        this(itemName, price, 1);
    }
    
    /**
     * Create accessor for itemName.
     * @return the itemName as a String type
     */
    public String getItemName() {
        return itemName;
    }
    
    /**
     * Create accessor for price.
     * @return the price as an double type
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Create accessor for quantity. 
     * @return the quatity as an integer type
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * A toString method for item. 
     * @return the price and quantity of item
     */
    public String toString() {
        return itemName + " ($" + price + ") x " + quantity;
    }
}

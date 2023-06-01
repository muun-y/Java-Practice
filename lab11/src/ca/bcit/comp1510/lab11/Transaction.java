package ca.bcit.comp1510.lab11;

/**
 * Create program that count the items and total price in the cart. 
 * 
 * @author Munyoung cho
 * @version 2023
 */
public class Transaction {
    
    /**
     * Create instance variable Item array named cart. 
     */
    private Item[] cart; 
    
    /**
     * Create instance variable totalPrice.
     */
    private double totalPrice; 
    
    /**
     * Create instance variable itemCount. 
     */
    private int itemCount; 
    
    /**
     * Create a contructor for Transaction. 
     * @param cartSize as an integer
     */
    public Transaction(int cartSize) {
        this.cart = new Item[cartSize]; 
    }
    
    /**
     * Create a method that add the items. 
     * @param name as String type
     * @param price as double type
     * @param quantity as an integer type
     */
    public void addToCart(String name, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        Item item = new Item(name, price, quantity);
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice() * item.getQuantity();
    }
    
    /**
     * Create a overloaded method that add the item to cart.  
     * @param item in Item object
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice() * item.getQuantity();
    }
    
    /**
     * Create a method that increase the size of the cart.
     */
    public void increaseSize() {
        final int three = 3; 
        Item[] newCart = new Item[cart.length + three];
        for (int i = 0; i < cart.length; i++) {
            newCart[i] = cart[i];
        }
        cart = newCart;
    }
    
    /**
     * Create a method that return the total price in the cart.
     * @return totalPrice in the cart
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Create a method that count the items in the cart.
     * @return count 
     */
    public int getCount() {
        int count = 0;
        for (int i = 0; i < itemCount; i++) {
            count += cart[i].getQuantity();
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < itemCount; i++) {
            sb.append(cart[i].toString()).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", totalPrice));
        return sb.toString();
    }
}

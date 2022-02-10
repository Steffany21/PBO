
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 11.80;
        double tax = 2.18;
        int quantity = 2;
        double totalPrice = (price*quantity)+tax;
        String message = custName+" wants to purchase a "+quantity+" "+itemDesc;
        System.out.println(message);
        System.out.println("total price with tax is: $"+totalPrice);
        
        // Declare and assign a calculated totalPrice
        // Modify message to include quantity      
        // Print another message with the total cost
        
    }    
}

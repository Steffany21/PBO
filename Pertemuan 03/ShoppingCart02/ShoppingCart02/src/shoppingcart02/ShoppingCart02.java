
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase 2 "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double harga = 12.00,
               pajak = 0.89;
        int kuantitas = 2;

        // Declare and assign a calculated totalPrice
        double total = (harga + pajak) * kuantitas;
        
        // Modify message to include quantity 
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("Total cost ith tax is: $" + total);
    }    
}

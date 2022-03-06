
package Tip02;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 10;
    
    public void findTotal(){
        //Calculate an individual's total after tax and tip
        //Print this value
        double total = originalPrice*(1+tax+tip);
        System.out.println(total);
    }
}

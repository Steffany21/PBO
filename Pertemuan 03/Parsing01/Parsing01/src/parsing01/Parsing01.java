package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "10", 
               taxRate = "0.24",
               gibberish = "210km24dfvs";

        double total;
      
        //Parse shirtPrice and taxRate, and print the total tax
        total = Double.parseDouble(taxRate) * Integer.parseInt(shirtPrice);
        System.out.println(total);
        
        //Try to parse taxRate as an in
        //Try to parse gibberish as an int
        System.out.println(Integer.parseInt(gibberish));
    }
    
}

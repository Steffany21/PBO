package processingname;

import java.util.Scanner;

public class ProcessName {
      
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        // your code goes here
        String firstName = console.next();
        String lastName = console.next();
        System.out.println(firstName.length());
        System.out.println("Your name is: " + lastName + ", " + firstName.charAt(0) +".");

        
    }
}
package com.example;

public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods comp = new ComputeMethods();

        //invoke the 3 methods and dispay their results
        System.out.println("Temp in celsius is: " + comp.convertftoC(52.0));
        System.out.println("Hypotenuse is: " + comp.hypotenuse(4, 10));
        System.out.println("The sum of the dice values is: " + comp.roll());
    }
}

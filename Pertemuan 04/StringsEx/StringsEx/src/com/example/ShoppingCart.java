/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        
        // Get the index of the space character (" ") in custName. 
        int spaceIdx = custName.indexOf(" ");
        System.out.println("Index of space character : " + spaceIdx);

        // Use the substring method parse out the first name and print it.
        String firstName = custName.substring(0,5);
        System.out.println("The first name : " + firstName);
    }

    
}

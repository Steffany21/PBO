/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
       Random num = new Random(); 
int randomNum = num.nextInt(3);
if(randomNum == 0){
    System.out.println("rock");
} else if(randomNum == 1){
        System.out.println("paper");
} else if(randomNum == 2){
    System.out.println("scissors");
}


    }
}

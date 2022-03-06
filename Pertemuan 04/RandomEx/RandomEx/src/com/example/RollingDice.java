/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        Random angka = new Random();
        int randAngka = angka.nextInt(6);
        System.out.println("Angka yang didapat : " + randAngka);
        if(randAngka == 0){
        System.out.println("coba lagi");
        } else {
        System.out.println("anda menang");
        }   
    }
}
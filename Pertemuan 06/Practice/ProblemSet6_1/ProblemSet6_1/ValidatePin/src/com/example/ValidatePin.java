package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pinAnda = 124365;
        System.out.print("Masukkan pin anda:");
        int input = in.nextInt();

            while(input != pinAnda){
            System.out.println("Pin anda salah");
            System.out.print("Masukkan pin anda: ");
            input = in.nextInt();
            }
        System.out.println("pin anda benar");
    }
}
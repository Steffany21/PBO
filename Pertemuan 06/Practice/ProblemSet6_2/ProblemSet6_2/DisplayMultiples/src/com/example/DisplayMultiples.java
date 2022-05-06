package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner num = new Scanner(System.in);
       System.out.println("Masukkan angka: ");
       int input = num.nextInt();
          for(int i = 1; i <= 12; i++){
          int multiples = input * i;
          System.out.println("Angkanya adalah " + multiples);
        }
    }

}

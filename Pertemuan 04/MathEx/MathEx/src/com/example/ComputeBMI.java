/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        double berat,tinggi;
        System.out.println("Menghitung BMI");
        System.out.println("===============");
        System.out.println("Masukkan berat badan dalam pon : ");
        berat = input.nextDouble();
        System.out.println("Masukkan berat tinggi dalam inci");
        tinggi = input.nextDouble();

        double bmi = (berat / (tinggi*tinggi))*703;
        int massaTubuh = (int)bmi;
        System.out.println("Index Massa Tubuh Anda adalah : " + massaTubuh);
        
        }
}

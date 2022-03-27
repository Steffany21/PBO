package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner color = new Scanner(System.in);
        System.out.println("Enter a color code");
        double wavelength = color.nextDouble();
        
        if(wavelength>=380 && wavelength<=450){
        System.out.println("The color a Violet");
        }
        else if(wavelength>=450 && wavelength<=495){
        System.out.println("The color a Blue");
        }
        else if(wavelength>=495 && wavelength<=570){
        System.out.println("The color a Green");
        }
        else if(wavelength>=570 && wavelength<=590){
        System.out.println("The color a Yellow");
        }
        else if(wavelength>=590 && wavelength<=620){
        System.out.println("The color a Orange");
        }
        else if(wavelength>=620 && wavelength<=750){
        System.out.println("The color a Red");
        }
        else{
        System.out.println("The netered wavelength is not a part of the visible spectrum");
        }
        }
    }

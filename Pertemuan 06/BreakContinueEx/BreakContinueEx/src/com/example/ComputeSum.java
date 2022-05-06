package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 10, input = 0, bil = 0;

        for(int i = 0; i <= num; i++){ 
        System.out.println("Masukkan angka: " + input);
        input = in.nextInt();
            if(input==0){
            break;
            }
                bil = bil + input;
            }
                System.out.println("jumlah angka: " + bil);
       
    }
}
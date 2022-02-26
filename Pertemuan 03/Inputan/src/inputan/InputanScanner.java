/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputan;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class InputanScanner {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka ke-1: ");
    int angka1 = input.nextInt();
    System.out.print("Masukkan angka ke-2: ");
    int angka2 = input.nextInt();

    int c = angka1 + angka2;
    System.out.println("hsil penjumlahan: " + c);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;

public class NameMaker {
    
    public static void main(String args[]){
       String firstName = JOptionPane.showInputDialog("Masukkan Nama Depan : ");
       String middleName = JOptionPane.showInputDialog("Masukkan Nama Tengah : ");
       String lastName = JOptionPane.showInputDialog("Masukkan Nama Terakhir : ");

String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Nama lengkap : " + fullName);
       
    
        
    }
    
}

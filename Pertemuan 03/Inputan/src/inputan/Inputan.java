/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputan;

import javax.swing.JOptionPane;

public class Inputan {

    public static void main(String[] args) {
//        String input = JOptionPane.showInputDialog("Masukkan Nama Anda: ");
//        System.out.println("Terima Kasih " + input);
//        
//        String angkaString = JOptionPane.showInputDialog("masukkan angka: ");
//        int angka = Integer.parseInt(angkaString);
//        System.out.println("angka yang dimasukkan adalah: " + angka);
//
//        int bil_1 = Integer.parseInt(JOptionPane.showInputDialog("masukkan bilangan 1: "));
//        int bil_2 = Integer.parseInt(JOptionPane.showInputDialog("masukkan bilangan 2: "));
//        int c = bil_1 + bil_2;
//        System.out.println("hasil penjumlahan " + c);

//String input = (String)JOptionPane.showInputDialog(null,"Masukkan nilai integer: ","Pertanyaan",0,null,null,0);

String[] namaBuah = {"apel", "anggur", "pisang", "semangka", "jeruk"};
String buahFavorite = (String) JOptionPane.showInputDialog(null, 
                                        "Pilih buah favorite anda: ", "Pilihan",
                                         3,null,namaBuah,namaBuah[2]);
        System.out.println("Buah favorite anda: " + buahFavorite);

JOptionPane.showMessageDialog(null,"buah favorite anda: " + buahFavorite,"judul",0);

    }
    
}

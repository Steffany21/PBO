package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Masukkan bil 1: ");        
        int a = sc.nextInt();
        System.out.println("Masukkan bil 2: ");
        int b = sc.nextInt();
        System.out.println("Masukkan bil 3: ");
        int c = sc.nextInt();
        
        int d = a + b + c;
        System.out.println("Hasil penjumlahan adalah: "+d);
        sc.close();
        //Remember to close the Scanner
        
    }
}

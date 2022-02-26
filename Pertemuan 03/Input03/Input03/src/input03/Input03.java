package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        //Find and print the sum of three integers entered by the user
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan ke-1: ");
int bil_1 = input.nextInt();
        System.out.println("Masukakn bilangan ke-2: ");
int bil_2 = input.nextInt();
        System.out.println("Masukkan bilangan ke-3: ");
int bil_3 = input.nextInt();

int total = bil_1 + bil_2 + bil_3;
        System.out.println("Hasil penjumlahan: "+total);
        
input.close();  
        //Remember to close the Scanner
        
    }   
}

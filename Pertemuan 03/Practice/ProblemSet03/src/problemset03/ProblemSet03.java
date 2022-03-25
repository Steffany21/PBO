package problemset03;

import javax.swing.JOptionPane;

public class ProblemSet03 {

    public static void main(String[] args) {
String input, pilih, harga, jumlah, tanya;
     input = JOptionPane.showInputDialog(null, "Hello!! Apa kabar?");
JOptionPane.showMessageDialog(null, "Hai! " + input);

pilih = JOptionPane.showInputDialog(null, "Pilih angka dari 1-3? ");
int pilihBuah = Integer.parseInt(pilih);
if(pilihBuah == 1){
    JOptionPane.showMessageDialog(null, "Buah kesukaan kamu adalah apel");
} else if(pilihBuah == 2){
    JOptionPane.showMessageDialog(null, "Buah kesukaan kamu adalah jeruk");
}else if(pilihBuah == 3){
    JOptionPane.showMessageDialog(null,"Buah kesukaan kamu adalah stroberi");
}

harga = JOptionPane.showInputDialog(null, "Masukkan harganya:");
jumlah = JOptionPane.showInputDialog("Masukkan jumlah buah: ");
double total = Double.parseDouble(harga);
double jum = Double.parseDouble(jumlah);
JOptionPane.showMessageDialog(null, "Total harganya adalah: " + (total*jum));

tanya = JOptionPane.showInputDialog(null,"Apakah ada tambahan lagi?");
JOptionPane.showMessageDialog(null, tanya);

        System.out.println("Hello!! Apa kabar? " + input);
        System.out.println("Buah kesukaan saya pada nomor " + pilihBuah);
        System.out.println("Dengan total harga " + (total*jum));
        System.out.println("Terima kasih sudah belanja!");

    }
    
}

package practice8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game{
private String namaTim;
private int totalWin, totalLose, totalTie, temperatur;
Scanner sc = new Scanner(System.in);
    Game() {

    }

public void namaTim(){
ArrayList<String> nama = new ArrayList<>();
    System.out.print("masukkan angka(>2): ");
    int a = sc.nextInt();
    double random = Math.random()*a;
    for(int i = 0; i <= a; i++){
    String tim = sc.nextLine();
    nama.add(tim);
  }
    System.out.println("tim yang main adalah " + nama.get((int)random));
}

public void startGame(){
Random ran =  new Random();

namaTim();
Scheduler sch = new Scheduler();
sch.Temperatur();

Tim tm = new Tim();
int tim1 = ran.nextInt(2)+5;
tm.skorTim();

}

}

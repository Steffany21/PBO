package practice8;

import java.util.Scanner;

public class Scheduler {
private int temperatur;

public Scheduler(int temp){
this.temperatur = temp;
}

    Scheduler() {
       
    }

public int Temperatur(){
Scanner sc = new Scanner(System.in);
System.out.print("masukkan temperatur: ");
temperatur = sc.nextInt();
    if(this.temperatur <= 10){
    System.out.println("too cold to play");
    }else{
    System.out.println("play");
    }
    return 0;
}

}
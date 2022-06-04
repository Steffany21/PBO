package practice8;

public class Tim {
private String namaTim;
private int totalWin = 2, totalLose = 4, totalTie = 1;

public Tim(String ntim, int twin, int tlose, int ttie){
this.namaTim =ntim;
this.totalWin = twin;
this.totalLose = tlose;
this.totalTie = ttie; 
}

    Tim() {

    }

public void totalWin(){
this.totalWin += 1;
}

public void totalLose(){
this.totalLose += 1;
}

public void totalTie(){
this.totalTie += 1;
}

public void skorTim(){
totalWin();
totalLose();
totalTie();
    System.out.println("total menang: " + this.totalWin);
    System.out.println("total kalah: " + this.totalLose);
    System.out.println("total seri: " + this.totalTie);
}

}

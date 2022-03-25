
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int hariSenin = 100,
            hariSelasa = 121,
            hariRabu = 117;
        
        float dailyAverage, monthlyAverage, monthlyProfit;

        dailyAverage = (float)(hariSenin + hariSelasa + hariRabu)/3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = (float) (monthlyAverage * 0.18);

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}

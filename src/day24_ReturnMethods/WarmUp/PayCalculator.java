package day24_ReturnMethods.WarmUp;

public class PayCalculator {
    public static void main(String[] args) {
        int hours=40;
        int rate=15;
        int pay =getHourlyPay(hours,rate);
        System.out.println("Total pay for "+hours+" hours is $"+pay);

    }
    public static int getHourlyPay(int hours, int rate){
        int totalPay = hours*rate;
        return totalPay;
    }
}

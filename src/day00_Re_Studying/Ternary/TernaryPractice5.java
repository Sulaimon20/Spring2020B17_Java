package day00_Re_Studying.Ternary;

public class TernaryPractice5 {
    public static void main(String[] args) {
        int num1=100;
        int num2=200;
        int min=(num1<num2)? num1: num2;
        System.out.println(min);
        System.out.println("==========================================");

        int hour = 14;
        String result= (hour<=12) ? "Good morning"
                                  : (hour>12 && hour < 18)
                                  ? "Good afternoon"
                                  : "Good evening";
        System.out.println(result);
        System.out.println("===============================================");

        int number =12000;
        boolean divisibaleBy2And5=(number%3 == 0 && number %5==0)? true : false;
        System.out.println(divisibaleBy2And5);

    }
}

package day00_Re_Studying.InterveiwQ.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 6;
        int num1 = 1;
        int num2 = 1;


        for (int i = 1; i <= count; ++i){
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        char ch='A';
        String st="A";
        String x=ch+st;

        System.out.println(ch+st);

    }
}

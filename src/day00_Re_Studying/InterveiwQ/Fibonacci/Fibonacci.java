package day00_Re_Studying.InterveiwQ.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int num1 = 0;
        int num2 = 1;


        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        System.out.print("Fibonacci Series of "+count+" numbers:");
    }
}

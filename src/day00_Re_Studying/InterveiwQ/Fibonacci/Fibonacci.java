package day00_Re_Studying.InterveiwQ.Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 8;
        int num1 = 1;
        int num2 = 1;
        for (int i = 1; i <= count; ++i){
            System.out.print(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }


}

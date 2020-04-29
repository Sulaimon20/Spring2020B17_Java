package day00_Re_Studying.InterveiwQ.Palindrome;

import java.util.Scanner;

public class PalindromeForNumbers {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter any num: ");
        int num=s.nextInt();

        int a,temp=0;
        int b=num;
        while(num>0)
        {
            a=num%10;
            num=num/10;
            temp=temp*10+a;
        }
        if(temp==b)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}

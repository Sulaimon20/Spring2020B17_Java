package OfficeHours;

import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=-2147483648;
        int min=2147483647;

        int i=1;
        while(i<=5){   /// 5 shows the times of asking number
            System.out.println("Enter a number ");
            int num=input.nextInt(); // 0

            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }

            i++;
        }

        System.out.println("The maximum of number is: "+max);

        System.out.println("The minimum of number is: "+min);


    }
}

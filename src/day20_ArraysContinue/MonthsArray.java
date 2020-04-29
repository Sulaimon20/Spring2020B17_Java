package day20_ArraysContinue;

import java.util.Scanner;

public class MonthsArray {
    public static void main(String[] args) {
        String [] months={"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
                    //      0       1     2      3      4       5       6       7     8       9     10      11

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int attemps=0;
        while (num>12||num<=0){
            System.out.println("Invalid entry");
            System.out.println("Please, re-enter the number");
            num=input.nextInt();
            attemps++;

            if (attemps==2 && (num>12||num<=0)){
                System.out.println("Invalid Entry, you already have 3 attemps");
                System.exit(0);
            }

        }
        String result=months[num-1];
        System.out.println(result);



    }
}

package day20_ArraysContinue;

import java.util.Scanner;

public class DaysArray {
    public static void main(String[] args) {
        String [] days={"Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday", "Sunday"};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
       int attepmts=0;
        while (num>7||num<1){
            System.out.println("Invalid Entry!!! Please, re-enter the number");
             num=input.nextInt();
            if (attepmts==3&& (num>7||num<1)){
                System.exit(0);
            }
        }


        String result = days[num-1];
        System.out.println(result);

    }
}

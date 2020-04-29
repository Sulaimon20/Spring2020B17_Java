package day00_SelfPractice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); //     here is input commander
        System.out.print("Input your number: "); // here the system print the question
        int x = in.nextInt();
        System.out.println(x+"*1="+x*1);
        System.out.println(x+"*2="+x*2);
        System.out.println(x+"*3="+x*3);
        System.out.println(x+"*4="+x*4);
        System.out.println(x+"*5="+x*5);
        System.out.println(x+"*6="+x*6);
        System.out.println(x+"*7="+x*7);
        System.out.println(x+"*8="+x*8);
        System.out.println(x+"*9="+x*9);
        System.out.println(x+"*10="+x*10);
    }
}
/*
import java.util.Scanner;

public class Exercise7 {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  System.out.print("Input a number: ");
  int num1 = in.nextInt();

  for (int i=0; i< 10; i++){
   System.out.println(num1 + " x " + (i+1) + " = " +
     (num1 * (i+1)));
  }
 }
}

 */
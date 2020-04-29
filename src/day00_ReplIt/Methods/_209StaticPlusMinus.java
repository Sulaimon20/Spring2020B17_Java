package day00_ReplIt.Methods;

import java.time.DayOfWeek;

public class _209StaticPlusMinus {
    public static void main(String[] args) {

       int a=0;
       int b=0;
        System.out.println("1+1 = "+calc.plus(1,1) );
        System.out.println("1-1 = "+calc.minus(1,1) );

    }

     static class calc{
         public static int plus(int a, int b){
             return a+b;
         }
         public static int minus(int a, int b){
             return a-b;
         }
    }

}

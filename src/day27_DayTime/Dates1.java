package day27_DayTime;

import java.time.LocalDate;

public class Dates1 {
    public static void main(String[] args) {

        LocalDate date=LocalDate.of(2020,10,25);
        System.out.println(date);
        int x=1979;
        LocalDate birthday=LocalDate.of(x,5,5);
        System.out.println(birthday);

        //isAfter
        boolean result=date.isAfter(birthday);
        System.out.println(result);//true


        //isBefore

        boolean result1=date.isBefore(birthday);
        System.out.println(result1);//false

        // isEqual

        boolean result2=date.isEqual(birthday);
        System.out.println(result2);//false

        //isLeapYear

        boolean result4=birthday.isLeapYear();
        System.out.println(result4);//false

        System.out.println("=============================================");

        LocalDate now=LocalDate.now();// 2020-04-23
        System.out.println(now);

        String str=now.toString();
        System.out.println("Today is: "+str);//2020-04-23
        System.out.println(str.replace("-", " "));


    }
}

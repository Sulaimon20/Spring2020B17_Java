package day27_DayTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");//2020/04/23
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yyyy");//23/04/2020
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMM/yyyy");//23/Apr/2020
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMM/dd/yyyy");//Apr/23/2020
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd MMMM yyyy");//23 April 2020
        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("EEE, MMMM yyyy");//Thu, April 2020

        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));
        System.out.println(date1.format(dtf1));
        System.out.println(date1.format(dtf2));
        System.out.println(date1.format(dtf3));
        System.out.println(date1.format(dtf4));
        System.out.println(date1.format(dtf5));
    }

}

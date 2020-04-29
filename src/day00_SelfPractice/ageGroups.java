package day00_SelfPractice;

import java.util.Scanner;

public class ageGroups {
    public static void main(String[] args) {
        System.out.println("Print your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        int age1 = 35;
        String ageGroup ="";
        if (age<3&& age >0){
            ageGroup="baby";
        }else if (age>3 && age<5){
            ageGroup="Toddler";
        }else if (age>6&&age<9){
            ageGroup="Kid";
        }else if (age>10&&age<12){
            ageGroup="Pre-Teen";
        }else if (age>13&&age<17) {
            ageGroup="Teenager";
        }else if (age>18&&age<0){
            ageGroup="Young Adult";
        }else if (age>21&&age<39){
            ageGroup="Adult";
        }else if (age>=40&&age<49){
            ageGroup="Young Middle-Aged Adult";
        }else if (age>50 && age<54){
            ageGroup="Middle-Aged Adult";
        }else if (age>55&&age<64){
            ageGroup="Very Young Senior Citizen";
        }else if (age>65&&age<74){
            ageGroup="Young Senior Citizen";
        }else if (age>75&&age<85){
            ageGroup="Senior Citizen";
        }else if (age>85&&age<120){
            ageGroup="Old Senior Citizen";
        }else {
            ageGroup="invalid entry";
        }
   //     boolean eligibility = (ageGroup == 0 && ageGroup<21)
        System.out.println(ageGroup);
//
    }
}
/*
age groups are:

                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
 */
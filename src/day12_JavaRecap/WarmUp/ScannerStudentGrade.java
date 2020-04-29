package day12_JavaRecap.WarmUp;

import java.util.Scanner;

public class ScannerStudentGrade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter grade:");
        byte grade=input.nextByte();
        if (grade<60) {
            System.out.println("Fail");
        }else if (grade<=60&&grade<90){
            System.out.println("Pass");
            }else if (grade>90){
            System.out.println("Passed with Distinction");

        }else{
            System.out.println("Invalid number");
        }
input.close();
    }
}
/*
 Write a Java Program that can calculate the grade of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
 */
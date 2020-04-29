package day12_JavaRecap;

import java.util.Scanner;

public class ScannerNumbStructure {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter five numbers");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        double num4=input.nextDouble();
        double num5=input.nextDouble();
        double sum=0;
        if (num1<0&&num1<num2&&num1<num3&&num1<num4&&num1<num5 ) {
            sum += num1;

        }
        System.out.println("The less valuable number is: "+sum );
        input.close();
        }

        }

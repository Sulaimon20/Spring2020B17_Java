package day10_Switch_Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        byte a=2;
        // float, long, boolean, double are not accepted in switch statement


        switch (a) {   //not true or false
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;

            default:
                System.out.println("Invalid case");
                break;
        }

    }
}

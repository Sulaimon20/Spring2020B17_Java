package day09_NestedIf_Ternary;

public class NestedIf {

    public static void main(String[] args) {

        boolean UScitizen = false; //pre-condition
        int age = 17; //condition

        if (UScitizen) {
            if (age > 17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You must be 18");
            }
        } else {
            System.out.println("Only the US citizens are eligible to vote");
        }

        int score = 98;
        String grade = "";
        if (score >= 0 && score <= 100) {
            if (score > 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score > 70) {
                grade = "C";
            } else if (score > 60) {
                grade = "D";
            } else if (score > 60) {
                grade = "F";
            } else {
                grade = "Invalid";

            }





            }



    }
}

package day09_NestedIf_Ternary;

public class NestedIf2 {
    public static void main(String[] args) {

        int score = 99;
        String grade = "";
        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                grade = "A";

            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else if (score < 60) {
                grade = "F";
            } else {
                grade = "Invalid";
            }
        }
        System.out.println(grade);

        int score2 = 80;
        String grade2 = "";

        if (score2 >= 0 && score2 <= 100) {
            grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : (score2 >= 70) ? "C" :
                    (score2 >= 60) ? "D" : "F";
        } else {
            grade2 = "Invalid";

        }
        System.out.println(grade2);
    }
}


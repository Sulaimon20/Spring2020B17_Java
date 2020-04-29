package day00_Re_Studying.Ternary;

public class TernaryPractice4 {
    public static void main(String[] args) {
        byte score =90;
        String grade=" ";
        String grade1 = (score>=90&&score<=100)
                        ? "Excellent"
                        : (score>=80&&score<90)
                        ? "Great"
                        :(score>=70&&score<80)
                        ? "Good"
                        : (score>=60&&score<=70)
                        ? "Pass"
                        : (score>=60&&score<=0)
                        ? "Failed"
                        : "Invalid";
        System.out.println(grade1);


    }

}

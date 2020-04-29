package day09_NestedIf_Ternary;

public class TernaryPractice {
    public static void main(String[] args) {
        // in ternary ? means if, : else
        String x="";
        if (9>10){
            x="9 is graeter";
        }else {
            x="1- is greater";
        }
        String y=(9>10) ? "9 is graeter" : "10- is greater";
        System.out.println(x);
        System.out.println(y);

    }
}

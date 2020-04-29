package day06_Unary_Shorthand_LogicalOperators;

public class divisionAssignment {
    public static void main(String[] args) {
        int a =6;
        a/=2;   // a=a
        System.out.println(a); // a=6/2=3
        int num1=400;
        num1/=20+10;
        System.out.println(num1); // 400/20+10

        int num3=300;
        num3%=10+20;   // =================> 300%10+20=300%30
        System.out.println(num3); // ===> 0
        int num31=400;
            num31 %=3*5;   // =================> 300%10+20=300%30
        System.out.println(num31); // ===> 0
    }
}

package day06_Unary_Shorthand_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int x = 20;
        x += 10; // x=x+y
        System.out.println(x); // ==>30
        x+=60;
        System.out.println(x);  //  ==> 90
        String x1 = "Cybertek";
        x1+=12345;
        System.out.println(x1); //      ==> Cybertek12345
        System.out.println('a'+'b'); // ==> 195
        char ch1='a';
        ch1+='b';
        System.out.println(ch1);  //    ==>  Ã
        int num='z';
            num+='x';
        System.out.println(num);     // ==> 242
        int A=100;
            A-=90;
        System.out.println(A);  //10

        int B=200;
            B-=A;
        System.out.println(B); // 190

    }
}
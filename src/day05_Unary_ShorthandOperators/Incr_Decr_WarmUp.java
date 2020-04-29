package day05_Unary_ShorthandOperators;

public class Incr_Decr_WarmUp {
    public static void main(String[] args) {

        int a=200;
        int b = -a++ + - --a*a--%2;
        //b=-200=> + - 200*200%2==>-200-400%2==>200-0=200
        double d=33.3;
        double c=  d ++ + ++d + 2*d %2    ;
        System.out.println(b);
        System.out.println(d);
    }


}

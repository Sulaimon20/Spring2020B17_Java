package day06_Unary_Shorthand_LogicalOperators;

public class multiplicationAssignment {

    public static void main(String[] args) {
        int a=2;
        a*=3;
        System.out.println(a); // ==>6
        int b=a*=10;
        System.out.println(b); //60

        int a1=100; // 200
        int b1=(a1*=2) + ++a1; //
        System.out.println(b1); //

        int x=10;
        int y=x+=10*2;
        System.out.println(y);

        int q=20;
        int p=q*=20*3; // =20*20*3
        System.out.println(p); //1200

    }

}

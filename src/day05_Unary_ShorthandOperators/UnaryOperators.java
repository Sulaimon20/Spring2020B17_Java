package day05_Unary_ShorthandOperators;

public class UnaryOperators {
    /* Unary operators
    + : unary plus operator = positive value; exp.:, int a =+10;
    - : minus operator = negative value; int a=10;
    -- : increment increase the value by 1 pre; post - increase/decrease by 1 not immediately
    ++ : decrement decrease the value by 1 pre; post
            post - increase/decrease by 1 not immediately
            pre - increase immediately by 1: int a =100 ++a
    ! :
    */
    public static void main(String[] args) {
        int a = 10; //positive
        int b = +a; // positive

        int a2=-10;
        boolean result1=a2>0; //false
        boolean result2=a2<0; //true

        int x1=20;
        int y2=-x1; //-20

        System.out.println(a);
        System.out.println(b);
        System.out.println(result1+ "   " + result2);
        System.out.println(y2);

        int z = 100;
            System.out.println("z "+ ++z);
            System.out.println(z);

        int p=100;
            System.out.println(p++); // still 100, but in next print it icrease
            System.out.println("p "+p);

        int A=100;
            System.out.println("A=  "+ A++); //100
            System.out.println(A); //101

        int B=100;
             System.out.println("B "+B--); //100
             System.out.println(B); //99

        int  s = 10;
        int f = s++;

        System.out.println("f "+f);//10
        System.out.println(s);//11
        System.out.println(f);//10

        double t1=3.5;
        double t2=t1--;
        System.out.println("t1 "+t2); //3.5
        System.out.println("t1 " +t1); //2.5

        int num=35;
        System.out.println(num++);





    }
}

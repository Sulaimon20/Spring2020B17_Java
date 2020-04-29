package day05_Unary_ShorthandOperators;

public class primitiveCasting {
    public static void main(String[] args) {
        int a1 = 10;
        long b1=a1;

        int a11=100;
        long b11=(long) a1;

        int a=100;
        byte b=(byte)a;

        double r=5.5;
        float t=(float)r; //5.5
        float y=(int)r; //5.0
        long q=(long)r; //5

        long largeNum=9999999999l;
        int I1= (int)largeNum;

        char ch1='a';
        short sh1=(short)ch1;

        System.out.println(b);//100
        System.out.println(b);//100
        System.out.println(t);
        System.out.println(y);
        System.out.println(q);
        System.out.println(I1);
        System.out.println(sh1);



    }
}

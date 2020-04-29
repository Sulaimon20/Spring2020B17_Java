package day26_Method_Overloading;

public class methodOverLoading3 {

    public static void main(String[] args) {
     //   System.out.println(sum(2,5));
       // System.out.println((int)sum(2.1,3.2));
        //System.out.println(sum(2.1,3));
        String src="Hello";
        sum1(src);

    }

    public static void sum1(String src){
        System.out.println("Hello");
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double a, int b){
        return a+b;
    }

    public static double sum(double a, double b){
        return a+b;
    }


}


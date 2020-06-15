package day23_Methods;

public class Methods2 {

    public double addition(int a, double b){
    return a+b;
    }

    public static void cube(int n)
    {
        //your code her
        System.out.println(n*n*n);
    }//end cube



    public static void main(String[] args) {
        cube(2);

        Methods2 num=new Methods2();
        double x=num.addition(2,1);

        System.out.println(x);

    }
}

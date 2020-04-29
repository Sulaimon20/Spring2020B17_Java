package day25_MethodsRecap;

public class return_methods {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int num=max(a,b);
        System.out.println(num);
        int num1=max1(a,b);
        System.out.println(num1);

    }
    public static int max(int a, int b){

        int max=0;
        if (a>b){
            max=0;
        }else{
            max=b;
        }
        return max;
    }
    public static int max1(int a, int b){

        if (a>=b){
            return a;
        }else{
        return b;
        }
    }

}

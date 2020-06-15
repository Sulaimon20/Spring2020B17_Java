package day26_Method_Overloading;

public class Add {
    //method overload
    int adder(int a, int b){
        return a+b;
    }
    int adder(byte a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Add num=new Add();//default constructor
        num.adder(2,3);
        System.out.println(num);//requires toString method
        System.out.println(num.adder(2,3));//gives the values
    }

}

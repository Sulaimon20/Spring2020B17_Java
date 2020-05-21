package day40_Encapsulation;

public class NestedClass {
    //class in another class is nested class
    //only nested class or inner class can be static

    static int a;

    static class data{
    // inner class
        static int a=300;
        static int b=300;

    }

    public static void main(String[] args) {

        //NestedClass.data
        System.out.println(data.a);



    }



}

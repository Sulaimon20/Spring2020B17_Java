package day42_Inheritance;

import static day23_Methods.test.reverse;
public class TestData extends Data{
 /*
visible         public static String publicData="public";
visible         protected static String protectedData="protected";
visible         static String defaultData="default";
not visible     private String privateData="private";
  */

    public static void main(String[] args) {
        System.out.println(TestData.publicData);    //visible
        System.out.println(TestData.protectedData); //visible
        System.out.println(TestData.defaultData);   //visible
       // System.out.println(TestData.privateData); //not visible

        String abc="name";
        String x=reverse(abc);
        System.out.println(x);


    }

}

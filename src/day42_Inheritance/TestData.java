package day42_Inheritance;

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

    }

}

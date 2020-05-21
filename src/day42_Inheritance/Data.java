package day42_Inheritance;

import Resources.Inheritance;

public class Data {

    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private String privateData = "private";
}
//      this is subclass
    class testing extends Data{

        public static void main(String[] args) {
            System.out.println(testing.publicData);    //     visible
            System.out.println(testing.protectedData); //     visible
            System.out.println(testing.defaultData);   //     visible
            // System.out.println(testing.privateData); //not visible

        }
    }




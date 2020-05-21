package Resources;

import day42_Inheritance.Data;
import day42_Inheritance.TestData;

public class Inheritance extends Data {
    public static void main(String[] args) {

    System.out.println(Inheritance.publicData);    //visible
    System.out.println(Inheritance.protectedData); //visible
    //System.out.println(Inheritance.defaultData); // not visible
    // System.out.println(Inheritance.privateData); //not visible

    }
}

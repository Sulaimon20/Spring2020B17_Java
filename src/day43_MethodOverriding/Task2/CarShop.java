package day43_MethodOverriding.Task2;

import day42_Inheritance.TestData;

public class CarShop {
    public static void main(String[] args) {

        Tesla tesla=new Tesla();
        tesla.start();
        System.out.println();

        Honda honda=new Honda();
        honda.start();

        Jeep jeep=new Jeep();

        jeep.start();

        BMW bmw=new BMW();
        bmw.start();


    }
}

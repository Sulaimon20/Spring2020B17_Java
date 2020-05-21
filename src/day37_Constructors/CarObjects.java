//this is an Object in Java

package day37_Constructors.WarmUp;

import day37_Constructors.Car;

public class CarObjects {
    public static void main(String[] args) {

        Car carObject1=new Car("Toyota", "Camry", 2020, 22000);
        System.out.println(carObject1);
        //System.out.println(carObject1);

        Car carObject2 = new Car("Nissan","Skyline",1999 , 4500);
        System.out.println(carObject2);
    }
}

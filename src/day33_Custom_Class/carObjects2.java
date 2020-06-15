package day33_Custom_Class;

import java.util.Arrays;

public class carObjects2 {
    public static void main(String[] args) {

        Car  car1= new Car();
        car1.setCarInfo("BMW", "X 5", 2020 , "Black|");
        car1.getCarInfo();
        Car car2= new Car();
        car2.setCarInfo("Toyota", "Camry", 2019, "Grey");
        Car car3=new Car();
        car3.setCarInfo("Toyota", "Camry", 2008, "White");
        Car car4=new Car();
        car4.setCarInfo("Honda", "SRW", 2015, "Blue");
        System.out.println("========================================");

        

        Car [] cars={car1,car2, car3,car4};
        for (int i=0; i<cars.length; i++){
            cars[i].getCarInfo();
        }
        for (Car eachCar:cars){
            eachCar.getCarInfo();
        }

        System.out.println("===============================================");
        System.out.println(car1);


    }
}

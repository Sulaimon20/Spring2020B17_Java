package day43_MethodOverriding.Task2;

public class Jeep extends Car{



    @Override
    public void start(){
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }




}

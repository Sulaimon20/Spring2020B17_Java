package day39_Encapsulation.WarmUp;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){

    }
    public Car(String brand, String model){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;

    }
    public Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;

    }
    public Car(String brand, String model, int year, double price){
        this.brand=brand;
         this.model=model;
         this.year=year;
         this.price=price;

    }
    public String toString(){
        return "Car brend "+brand +
               "\nCar model "+model+
                "\nyear "+year+
                "\nprice $"+price;
    }

    public static void main(String[] args) {
        Car car1=new Car("Toyota", "Camry", 1999, 10000.34);

        System.out.println(car1);


    }


}

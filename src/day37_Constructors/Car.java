package day37_Constructors;

public class Car {
// these are instance variables
    String brand;
    String model;
    int year;
    double price;
// this this constructor
    public Car(String brand, String model, int year, double price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }
//this print method
    public String toString(){
        return  brand+" "+ model+" "+year+" $"+price;

    }
}

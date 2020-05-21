package day42_Inheritance.Task2;

public class TV extends Device{


public TV (String brand, String model, int size, double price, String type){

    setBrand(brand,model,size,"TV", price);

}

    public void watch(){
        System.out.println("watching: "+brand+" TV");
    }

}

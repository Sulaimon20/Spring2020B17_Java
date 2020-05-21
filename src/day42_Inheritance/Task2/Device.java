package day42_Inheritance.Task2;

public class Device {
    public String brand;
    public String model;
    public int size;
    public String type;
    public double price;
    public static String country="China";


    public String toString() {
        return "Brand: "+brand+" Model: "+model +" Type: "+type+
                " Price: "+price+" Country: "+country;
    }

    public void setBrand(String brand, String model, int size, String type, double price) {
        this.brand=brand;
        this.model=model;
        this.size=size;
        this.type=type;
        this.price=price;
    }
}

package day42_Inheritance.Task2;

public class Phone extends Device{

    public Phone(String brand,String model,int size, double price){
        setBrand(brand,model,size,"Phone", price);
    }

    public void call(){
        System.out.println("calling with: "+brand);
    }
    public void text(){
        System.out.println("text with: "+brand);
    }


}

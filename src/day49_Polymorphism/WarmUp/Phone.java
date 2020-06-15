package day49_Polymorphism.WarmUp;

public abstract class Phone {
//1. create an abstract class called Phone
//	attributes: brand, model, price, size
//	abstract methods: calling(), texting()
//	instance method: toString()
    public static String brand;
    public String model;
    public double price;
    public String size;
//2. create the following subclasses of phone:
//	1. iPhone
//	2. Samsung
    public abstract void calling(long phoneNumber);
    public abstract void texting(long phoneNumber);

    public String toString() {
        return "brand: " + brand + ", model: " + model +", price: " + price +", size: " + size;
    }
}
 class iPhone extends Phone{

     static {brand="iPhone";}
     //constructor
    public iPhone(String model,double price,String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    public void FaceTiming(long phoneNumber) {
        System.out.println("iPhone is facetiming "+phoneNumber);
    }

     @Override
     public void calling(long phoneNumber) {
         System.out.println("iPhone is calling with "+phoneNumber);
     }
     @Override
     public void texting(long phoneNumber) {
        System.out.println("iPhone is texting with "+phoneNumber);
    }


    }
class Samsung extends Phone{
    //constructor
    public Samsung(String model,double price,String size){
        brand="Samsung";
        this.model=model;
        this.price=price;
        this.size=size;
    }

    public void calling(long phoneNumber) {
        System.out.println(brand+" is calling");
    }
    public void freezing(long phoneNumber){
        System.out.println(brand+" is freezing");
    }

    public void texting(long phoneNumber) {
        System.out.println(brand+" is texting");
    }
}
class Objects {
    //iPhone object
    public static void main(String[] args) {

        iPhone obj = new iPhone("8", 8000.00, "small");
        System.out.println(obj);

        iPhone obj2 = new iPhone("9", 8000.00, "Large");
        System.out.println(obj2);

        obj.calling(571300456);
        obj.texting(571300456);
        obj.FaceTiming(571300456);

        //Samsung object
        Samsung obj3 = new Samsung("Gallancy", 789.30, "small");
        System.out.println(obj3);
        obj3.calling(3453452);
        obj3.texting(3465345);

    }
}
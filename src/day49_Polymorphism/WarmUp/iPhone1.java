package day49_Polymorphism.WarmUp;

public final class iPhone1 extends Phone1 implements AppleApps {

    static {
        brand="Apple";
    }
    public void download() {
        System.out.println("iPhone is downloading apps");
    }
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+phoneNumber);

    }
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling to "+phoneNumber);

    }
    public void faceTiming(long phoneNumber) {
        System.out.println("iPhone is facetiming to "+phoneNumber);
    }

    public iPhone1(String model,double price, String size) {
         this.model=model;
         this.price=price;
         this.size=size;
    }

}

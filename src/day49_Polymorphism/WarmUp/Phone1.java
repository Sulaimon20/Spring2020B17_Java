package day49_Polymorphism.WarmUp;

interface downloadable{
    public boolean downloadable=true;
    abstract void download();
}
interface AndroidApps extends downloadable{
    String AppStoreName="Android";
}
interface AppleApps extends downloadable{
    String AppStoreName="Android";
}
public abstract class Phone1  {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);
    public String toString() {
    return "brand: "+brand+ "model: "+model+", price: "+price+", size: "+size;
    }
}

package day49_Polymorphism.WarmUp;

public class PhoneObjects {
    public static void main(String[] args) {


    iPhone1 obj = new iPhone1("iPhone 10 Pro", 1000.50, "small");
        System.out.println(obj);
        obj.calling(343434);
        obj.download();
        obj.faceTiming(345345);
        obj.texting(3434);

    }
}

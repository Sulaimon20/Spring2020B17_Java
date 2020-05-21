package day42_Inheritance.Task2;

public class DeviceObjects {


    public static void main(String[] args) {

        TV tv1=new TV("Sumsung","E234", 23, 500, "");
        tv1.country="USA";
        System.out.println(tv1);

        Phone phone1=new Phone("Iphone", "11", 12, 2000);
        System.out.println(phone1);


    }
}

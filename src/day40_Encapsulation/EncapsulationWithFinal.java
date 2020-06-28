package day40_Encapsulation;

public class EncapsulationWithFinal {
    private final int a;
    public EncapsulationWithFinal(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        EncapsulationWithFinal obj=new EncapsulationWithFinal(123);
        System.out.println(obj.getA());

    }
}
class A{
    public static void main(String[] args) {
        EncapsulationWithFinal obj=new EncapsulationWithFinal(54);
        System.out.println(obj.getA());
        obj.getA();

    }



}


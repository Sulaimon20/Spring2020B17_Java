package day13_StringClass;
//boolean expression
public class endsWithStringClass {

    public static void main(String[] args) {
        String str="Universe";
        System.out.println(str.endsWith("se"));//true
        System.out.println(str.endsWith("Un"));//false
        System.out.println(str.endsWith("Vers"));//false

    }
}

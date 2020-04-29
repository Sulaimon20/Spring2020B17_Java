package day14_StringClass;
// checks if 2 strings are equal
public class equalStringClass {
    public static void main(String[] args) {
        String s1="Cat";
        String s2=new String("Cat");
        System.out.println(s1==s2);//false, different locations, different objects;
        System.out.println(s1.equals(s2));//true

        String z1="Tiger";
        String z2=new String("Tiger");
        String z3="Tiger";
        System.out.println(z1.equalsIgnoreCase(z3));



    }
}

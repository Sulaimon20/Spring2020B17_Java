package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1="Cat";
        String str2=new String("Cat");
        String str3="Cat";                      // String pool
        String str4= new String("Cat");

        System.out.println("(1) "+(str1+" " +str2));
        System.out.println("(2) "+(str1==str2)); //two different object, false
        System.out.println("(3) "+(str1==str3)); //true
        System.out.println("(4) "+(str2==str4)); //
        String s1="Java";
        s1="JavaScript";
        System.out.println("(5) "+s1); // "JavaScript"
        String s2="Java";// no new object will be created
        System.out.println("(6) "+(s1==s2));

    }
}


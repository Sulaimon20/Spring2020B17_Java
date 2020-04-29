package day13_StringClass;
//equalsIgnoreCase =====> is boolean expression
//this method compares two strings, ignoring lower case and upper case differences.
public class equalsIgnoreCaseStringClass {

    public static void main(String[] args) {
        String str1="HELLO";
        String str2="hello";
        String str3="World";
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//false

    }
}

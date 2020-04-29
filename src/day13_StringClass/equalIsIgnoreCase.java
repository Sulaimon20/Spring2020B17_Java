package day13_StringClass;
//does not care about case sensetivity;
public class equalIsIgnoreCase {
    public static void main(String[] args) {
        String str1="CYBERTEK";
        String str2="cybertek";
        System.out.println(str1.equals(str2));// not equal === false
        System.out.println(str1.equalsIgnoreCase(str2)); // equal. true
    }
}

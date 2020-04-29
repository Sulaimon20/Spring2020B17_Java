package day21_MultiDimensionalArray;

public class StringCharMethods {
    public static void main(String[] args) {
        String name="Java"; // 'J", 'a', 'v', 'a'

        char [] chars=name.toCharArray();// length is 4

        System.out.println(chars[0]);// it is print us 'J'
        System.out.println(chars[3]);// 'a'
        System.out.println(chars[4]);// exception=== we don't have 4
    }
}

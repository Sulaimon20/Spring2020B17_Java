package day00_Re_Studying.Ternary;

public class ternary {
    public static void main(String[] args) {

        int num = 100;
        String result = "";
        if (num % 2 == 0) {
            result = "Even number";
        } else {
            result = "Odd number";
        }
        String result2 = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("========================================================");
        int num1 = 100;
        int num2 = 200;
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        int max2 = (num1 > num2) ? num1 : num2;
        System.out.println(max);
        System.out.println(max2);
        System.out.println("===================================");

        String str = "";
        if (true) {
            str = "Hello";
        } else {
            str = "Hola";
        }
        System.out.println("1 "+str);
        String str2 = (false) ? "Hello" : "Hola";
        System.out.println("2 "+str2);

    }
}
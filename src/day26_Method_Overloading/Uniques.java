package day26_Method_Overloading;

public class Uniques {
    public static void main(String[] args) {

        String str="ABBBCDB";
        String result="";

        System.out.println(result);

        String str2="Cybertek";

        String result2=uniques(str2);
        System.out.println(result2);

    }
    //this is method overloading with unique
    public static String uniques(String str){

        String result="";
        for (int i=0; i<str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;


    }
    //this is method overloading with frequency
    public static int frequency (String str, char ch) {
        char[] arr = str.toCharArray();//[A,A,A]
        int count = 0;
        for (int each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}

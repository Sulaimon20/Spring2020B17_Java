package day00_Re_Studying;

public class FINRA {
    public static void finraTo(int end) {
        for (int i = 0; i <= end; i++) {
            String s = "";
            //if (i%3=0) s="FIN";

        }
    }

    public static void main(String[] args) {

        String str = "INTERVIEW";
        Test(str);
        System.out.println(Test(str));

    }

    public static String Test(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.toCharArray()[i];
        return reverse;

    }
}













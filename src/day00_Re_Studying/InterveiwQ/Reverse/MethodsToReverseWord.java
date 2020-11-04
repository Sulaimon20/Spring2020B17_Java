package day00_Re_Studying.InterveiwQ.Reverse;

public class MethodsToReverseWord {
    public static void main(String[] args) {

        String name1 = "Muhtar";
        ReverseString(name1);
    }

    static public void ReverseString(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
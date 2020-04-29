package day00_Re_Studying.InterveiwQ.ExtractDigit;

public class ExtractNumbers {
    public static void main(String[] args) {
        String str="Today's date is 04/27/2020";
        String num=str.replaceAll("[^0-9]", "");
        System.out.println(num);
        int num1=Integer.parseInt(num);
        System.out.println(num);
    }
}

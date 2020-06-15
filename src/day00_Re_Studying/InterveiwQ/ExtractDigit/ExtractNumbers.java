package day00_Re_Studying.InterveiwQ.ExtractDigit;

public class ExtractNumbers {
    public static void main(String[] args) {
        String str="Today's date is 04/27/2020";
        String num=str.replaceAll("[^0-9]", "");
        String let=str.replaceAll("[^a-z]", "");
        System.out.println(num);
        System.out.println(let);
        int num1=Integer.parseInt(num);
        System.out.println(num);
        System.out.println("[^a-z]");


    }
}

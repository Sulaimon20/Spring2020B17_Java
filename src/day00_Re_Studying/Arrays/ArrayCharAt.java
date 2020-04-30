package day00_Re_Studying.Arrays;

public class ArrayCharAt {
    public static void main(String[] args) {

        String name="Iman";
        String name2=name.toLowerCase();
        name.toLowerCase();
        String reverse="";
        for (int i=name2.length()-1; i>=0; i--){
            reverse+=name2.charAt(i);
        }

        System.out.println(reverse);
    }
}

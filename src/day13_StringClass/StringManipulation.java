package day13_StringClass;

public class StringManipulation {

    public static void main(String[] args) {
        String str1="Cybertek";
        // index     01234567
        char ch1= str1.charAt(5);
        System.out.println("(1) the index 5 in the word Cybertek == to character "+ch1);
        System.out.println("(2) "+(ch1=='A'));//false
        System.out.println("(3) "+(ch1=='T'));//false
        System.out.println("==================================");

        int totalLenght=str1.length();
        System.out.println("(4) "+totalLenght);
        System.out.println("(5) "+(totalLenght>250));//false

        String str2="Today is great day";
        int maxIndexNum=str2.length()-1;
        System.out.println("(6)"+maxIndexNum);
        System.out.println("====================================");

        String s1="Cybertek";
            s1.concat("School"); //Cybertek
        System.out.println("(7)"+s1);

            s1=s1.concat(" School");// Cybertek School
        System.out.println("(8)"+s1);
        String s2="Java";
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);


    }
}

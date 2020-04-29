package day10_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {
        char ch= 'A';
        String result=" ";

        switch (ch) {   //not true or false
            case 'A':
                result +="\nA";

            case 'B':
                result +="\nB";
            case 'C':
                result +="\nC";

                System.out.println(result);


        }
    }
}

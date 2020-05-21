package day00_SelfPractice;

import java.util.Scanner;

public class musicSetUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of music do you wanna listen?\nPlease select Nostalgic or not nostalgic");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("Nostalgic")) {
            System.out.println("Please copy paste this link in browser\n  https://youtu.be/CAGlI_2vQpg ");
        }
        if( answer.equalsIgnoreCase("Not nostalgic")){
            System.out.println("Please copy paste this link in browser\n      https://youtu.be/hn3wJ1_1Zsg ");
        }
        while (!(answer.equalsIgnoreCase("Nostalgic") || answer.equalsIgnoreCase("Not nostalgic"))) {
            System.out.println("Please select Nostalgic or not nostalgic");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("Nostalgic")) {
                System.out.println("Please copy paste this link in browser\n  https://youtu.be/CAGlI_2vQpg ");
            }
            if( answer.equalsIgnoreCase("Not nostalgic")){
                System.out.println("Please copy paste this link in browser\n      https://youtu.be/hn3wJ1_1Zsg ");
            }
        }
    }
}

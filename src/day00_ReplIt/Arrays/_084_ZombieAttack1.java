package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _084_ZombieAttack1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int days=0;
        int result =0;

        for (int i =1; i<=inhabitants;  i=i*2) {
            System.out.println("Day "+days+" ["+(inhabitants/i)+"]");
            days=days+1;
        }
        System.out.println("---- EXTINCT ----");
    }
}


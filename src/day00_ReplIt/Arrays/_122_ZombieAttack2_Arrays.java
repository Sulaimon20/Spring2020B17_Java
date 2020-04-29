package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _122_ZombieAttack2_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //TODO. Write you code below this line.


        int day=0;
        System.out.println("Day " + day + Arrays.toString(inhabitants));// precondition: day ZERO
        while (true){
            for (int i=0; i<inhabitants.length; i++){// loop for checking and increasing cities
                inhabitants[i]/=2;//                    the population is decreasing 2 time
            }
            day++;//                                     days are growing
            System.out.println("Day " + day + Arrays.toString(inhabitants));//
            int population=0;//

            for (int i=0; i<inhabitants.length; i++){
                population=inhabitants[i]+population;
            }
            if (population==0){
                System.out.println("----EXTINCT----");
                System.exit(0);
            }
        }

    }
}
/*
        for (int i =1; i<=inhabitants;  i=i*2) {
            System.out.println("Day "+days+" ["+(inhabitants/i)+"]");
            days=days+1;
        }
        System.out.println("---- EXTINCT ----");
    }
}
*/

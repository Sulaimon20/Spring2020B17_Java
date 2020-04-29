package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _119_Arrays_Average_temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        double length=temps.length;
        for ( k=0; k<=temps.length-1; k++){
            double eachNum=temps[k];
            avgTemp+=eachNum;
        }
        System.out.println(avgTemp/(double) length);
    }
}


package OfficeHours._4_15_Arrays;

public class nestedLoops {
    public static void main(String[] args) {
        char [][] arr2D={ {'A','B'}, {'C','D','E'}, {'F','J','H'} };
        //              //  0               1               2

        for (int j=0; j<arr2D.length; j++){
            for (int i=0; i<arr2D[j].length; i++){
                System.out.print(arr2D[j][i]+ " ");
            }
        }
        System.out.println("\n==========================================");

        for (char [] each: arr2D){
            for(char eachElement: each){
                System.out.print(eachElement+" ");
            }
        }
        System.out.println();
        //arr2D[0}
        for (int i=0; i<=arr2D[0].length-1; i++){
            System.out.print(arr2D[0][i]+" ");// A B
        }
        System.out.println();
        //arr2D[1}
        for (int i=0; i<=arr2D[1].length-1; i++){
            System.out.print(arr2D[1][i]+" ");// C D E
        }
        System.out.println();
        //arr2D[2}
        for (int i=0; i<=arr2D[2].length-1; i++){
            System.out.print(arr2D[2][i]+" ");// F J H
        }

    }
}

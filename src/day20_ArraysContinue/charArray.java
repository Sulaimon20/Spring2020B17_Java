package day20_ArraysContinue;

import java.util.Arrays;

public class charArray {
    public static void main(String[] args) {
        char [] ch={'A','S','Z', 'Y', 'W','R','X','D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));//[A, D, R, S, W, X, Y, Z]

        String[] names={"Anna", "Van", "Truck", "Ali", "Zorro", "TV", "Paper"};
        System.out.println(names);//[Ljava.lang.String;@6acbcfc0

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));//[Ali, Anna, Paper, TV, Truck, Van, Zorro]

        int [] arr={3,4,1,123,-422, 200,55};
//decending
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);
        System.out.println("\n"+Arrays.toString(arr));




    }
}

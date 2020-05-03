package day00_Re_Studying.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaOddEven {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

    Consumer<Integer> oddOrEven = i -> {
        if(i % 2 == 0) {
            System.out.println("Even number :: " + i);
        } else {
            System.out.println("Odd  number :: " + i);
        }
    };


}

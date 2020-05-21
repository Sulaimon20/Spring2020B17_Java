package day00_ReplIt.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class switchElements {
    public static int[] do_switch(int[] i){
        int reverse = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = reverse;
        return i;

    }

    public static void main(String[] args) {
        int [] i={1,2,3,4};
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(do_switch(i)));
    }
}

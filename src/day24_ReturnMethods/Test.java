package day24_ReturnMethods;

import Resources.Library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str="Cybertek";
        String RevStr = Library.Reverse(str);
        System.out.println(str.equalsIgnoreCase(RevStr));

        int [] arr={100,200,5333,23,9,71};
        arr=Library.sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
}

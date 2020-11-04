package day00_Re_Studying.Arrays;

public class ArrayForLoop {
    public static void main(String[] args) {
        // Create a new array with a capacity of 10.
        int[] array = new int[10];

// Current length is 0, because it has 0 elements.
        int length = 0;

// Add 3 items into it.
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            // Each time we add an element, the length goes up by one.
            length++;
        }


        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);
    }
}

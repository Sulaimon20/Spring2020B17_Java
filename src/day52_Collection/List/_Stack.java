package day52_Collection.List;

import java.util.Stack;
import java.util.Vector;

public class _Stack {
    public static void main(String[] args) {
        Vector<Integer> vector =new Vector<>();//the difference ==> synchronized
        vector.add(12);

        Stack <Integer> stack =new Stack<>();
        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        System.out.println(stack);

        System.out.println();
    }
}


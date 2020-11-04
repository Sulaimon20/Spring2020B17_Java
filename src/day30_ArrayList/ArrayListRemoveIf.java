package day30_ArrayList;

import day37_Constructors.WarmUp.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListRemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //this is lambda expression
       numbers.removeIf( number -> number % 2 == 0 );//remove even numbers
        System.out.println("numbers = " + numbers);
       numbers.removeIf(x  -> x>=5);// remove numbers more than 5

        System.out.println(numbers);



    }


}

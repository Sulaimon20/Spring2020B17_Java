package day43_MethodOverriding.Task1;

//this is superclass which has 2 instance variables

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Shape {
    public double perimeter;
    public double area;

    //double diameter;
    //double radius;
    //static double PI = 3.14;

    //method
     void calculateArea(){
        area=0;
        System.out.println("Area of the shape: " +area);

    }



    //method 2

    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape is "+perimeter);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,6,6,45,23,8));
        Collections.sort(list);
        //System.out.println(Arrays.asList(list));

        ArrayList<Integer> list1=new ArrayList<>();

        for (int each: list){
            if (!list.contains(each)){
                list1.add(each);
            }
        }
        System.out.println(Arrays.asList(list1));
              {

        }



    }
}

package day00_Re_Studying.InterveiwQ.Collection.List;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> names=new Stack<>();//add() ->add, pop() -> remove, push()
        names.add("Tomm");
        names.add("Alex");
        names.add("Bony");
        names.add("Rose");
        names.add("Tim");
        names.push("Roma");

        System.out.println(names);//[Tomm, Alex, Bony, Rose, Tim, Roma]
        String s1=names.pop();//remove the last one ==> last in, first out LIFO
        String s2=names.pop();//remove the last one ==> last in, first out LIFO
        String s3=names.pop();//remove the last one ==> last in, first out LIFO

        System.out.println(s1);//Tim
        System.out.println(s2);//Rose
        System.out.println(s3);//Bony
        System.out.println(names);//[Tomm, Alex]
        names.push("Dimon");//[Tomm, Alex, Dimon]
        System.out.println("names = " + names);//[Tomm, Alex, Dimon]


    }

}

package day00_ReplIt.Methods;
import java.util.Arrays;
import java.util.Scanner;
public class _146_Methods8split_person_info_VoidMethods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String word1){
        String [] word=word1.split(",");
        System.out.println("person name: "+word[0]+" last name: "+word[1]+" age: "+word[2]);

    }//end person


}


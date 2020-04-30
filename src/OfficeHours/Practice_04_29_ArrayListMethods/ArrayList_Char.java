package OfficeHours.Practice_04_29_ArrayListMethods;

import java.util.ArrayList;

public class ArrayList_Char {
    public static void main(String[] args) {
        ArrayList<Character> alphabet=new ArrayList<>();
        for (Character i='A'; i<='Z'; i++){
                alphabet.add(i);
        }
        System.out.println(alphabet);

        ArrayList<Character> alphabet1=new ArrayList<>();

        for (Character i='Z'; i>='A'; i--){
            alphabet1.add(i);
        }
        System.out.println(alphabet1);

        for (Character i='Z'; i>='A'; i--){
            alphabet1.get(i);
        }

    }
}

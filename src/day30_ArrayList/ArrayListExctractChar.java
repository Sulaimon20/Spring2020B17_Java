package day30_ArrayList;

import java.util.ArrayList;

public class ArrayListExctractChar {
    public static void main(String[] args) {

        ArrayList<Character> alphabet=new ArrayList<>();
        for (Character i='A'; i<='Z'; i++){
            alphabet.add(i);
        }
        String a="";
        for (int i=0; i<alphabet.size(); i++){
            a+=(alphabet.get(i));
        }
        System.out.println(a);
        String reverse="";
        for (int i=a.length()-1; i>=0; i--){
            reverse+=a.charAt(i);
        }
        System.out.println(reverse);
    }
}

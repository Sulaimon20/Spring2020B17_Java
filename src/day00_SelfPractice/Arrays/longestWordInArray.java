package day00_SelfPractice.Arrays;

import java.util.Arrays;

public class longestWordInArray {
    public static void main(String[] args) {
        String [] names={"Tim", "Abba", "Thomsom", "Danis", "Walter"};
        int firstName=names[0].length();
        String longestName="";
        for (int i=0; i<names.length; i++){
            if (names[i].length()>firstName){
                firstName = names[i].length();
                longestName=names[i];
            }
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("First Name: "+ names[0]);


    }
}

package day00_Re_Studying.InterveiwQ.DuplicateNonDuplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDupSaim {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBBCCCCDDD"));


    }
    public static String removeDup(String s){
        return new LinkedHashSet<String>(Arrays.asList(s.split(""))).toString().replace("[","")
                .replace("]","").replace(", ","");
    }
}

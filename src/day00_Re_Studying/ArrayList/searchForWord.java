package day00_Re_Studying.ArrayList;

import java.util.ArrayList;

public class searchForWord {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("customer LA");
        arr.add("google");
        arr.add("abc");

        String str="LA";
        String result="";
        for (int i=0; i<arr.size();i++){
            if (arr.get(i).contains(str)){
                result+=arr.get(i);
            }
        }
        System.out.println(result);


    }
}

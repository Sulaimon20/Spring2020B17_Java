package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _095_GetSandwich_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int bread=0;

        for (int i=0;i<str.length()-4;i++){
            if (str.substring(i,i+5).equalsIgnoreCase("bread")){
                bread++; } }
        if (bread>=2){
            str=str.replaceFirst("b","");
            System.out.println(str.substring(str.indexOf("d")+1,str.lastIndexOf("bread")));
        }
        else {
            System.out.println("nothing");
        }

    }
}
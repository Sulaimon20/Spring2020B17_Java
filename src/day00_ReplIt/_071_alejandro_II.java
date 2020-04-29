package day00_ReplIt;

import java.util.Scanner;

public class _071_alejandro_II {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        String result="";
        if (a.contains(" alejandro ")) {
            result="read this mail";
            if (a.contains("project ")){
                    result="read this mail";  }
            if (a.contains(" alejandro ")){
                result="read this mail";  }
              }else {
            result="dont read";
                }
        System.out.println(result);
        }
    }

/*
a = "dear alejandro.....alot of text"

outputs: "dont read"

a = "thunder blaz is the best drink in the galaxy..."

outputs: "dont read"

a = "subject : important project, alejandro we refer to you  this ...."

outputs: "read this mail"
 */
package day00_ReplIt;

public class ConditionalStatment {
    public static void main(String[] args) {
    String word="Rewaery";
    String result="";
    if (word.endsWith("y")){
        result = word+""+"es";
    }else if (word.endsWith("ey")){
            result = word+""+"s";
    }else if (word.endsWith("ife")){
        result = word+""+"ves";
    }else{
        result = word+""+"s";
    }
        System.out.println(result);


    }

}
/*
 For you to do:

Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
 */
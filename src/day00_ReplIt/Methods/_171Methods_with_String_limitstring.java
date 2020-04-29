package day00_ReplIt.Methods;

public class _171Methods_with_String_limitstring {
    public static String limit(String text, int maxLength)
    {
        String word=text.substring(0,maxLength);
        return word;


    }

    public static void main(String[] args) {
        System.out.println(limit("bla bla",3));

    }
}
/*
limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"
 */
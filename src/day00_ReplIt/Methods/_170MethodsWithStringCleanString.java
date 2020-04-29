package day00_ReplIt.Methods;

public class _170MethodsWithStringCleanString {
    public static String clean(String text ,String badWord) {
        String result =text+""+badWord;
        String result1=result.replace(badWord,"");
        return result1;
    }

    public static void main(String[] args) {
        String text="one two three";
        String badWord="two";
        System.out.println(clean(text,badWord));
    }
}
/*
This method gets two strings (text and badWord)  and returns a string.
basicly what it does is take out all the occurrences of badWord in text.
for example:
clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
 */
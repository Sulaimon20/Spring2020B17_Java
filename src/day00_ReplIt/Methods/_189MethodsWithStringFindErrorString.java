package day00_ReplIt.Methods;

public class _189MethodsWithStringFindErrorString {
    public static boolean isError(String line)
    {
        if (line.startsWith("error")){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isError("three four error"));
    }
}
/*
isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

 */
package day00_ReplIt.Methods;

public class _186MethodsWithStringExtractNumberFromString {
    public static String extractNum(String s) {
        return s.replaceAll("[^0-9]","");
    }

   public static void main(String[] args) {
        System.out.println(extractNum("aa!!%$#.10aa"));

        }
}
/*
extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23

extractNum("aa2") ==> 2

extractNum("aa10aa") ==> 10

extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or conditions

 */

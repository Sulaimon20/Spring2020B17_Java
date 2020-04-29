package day00_ReplIt.Methods;

public class _173MethodswithStringBiggerString {
    public static String biggerS(String a ,String b)
    {
        if (a.length()>b.length()){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(biggerS("apple","orange"));
    }

}
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
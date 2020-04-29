package day00_ReplIt.Methods;

public class _174MethodsWithStringRemoveFirstChar {
    public static String removeFirst(String target) {

        String word=(target.substring(1,target.length()));
        return word;
    }

    public static void main(String[] args) {
        System.out.println(removeFirst("aaa"));
    }

}
/*
removeFirst("aaa")
returns "aa"
 */

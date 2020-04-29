package day00_ReplIt.Methods;

public class _179MethodsWithStringReverseString {
    public static String reverse(String input)
    {
        String rev="";
        for (int i=input.length()-1; i>=0; i--){
            rev+=input.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String reverse1 ="foo";
        System.out.println(reverse("foo"));
    }
}

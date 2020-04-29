package day00_ReplIt.Methods;

public class _194MethodswithStringPalindrome {
    public static boolean isPalindrome(String check) {
        String kcehc="";
        String check1=check.replaceFirst(" ","");
        for (int i=check1.length()-1; i>=0; i--){
            kcehc+=check1.charAt(i);
        }
        if (check1.equalsIgnoreCase(kcehc)){
            return true;
        }else {
        return false;}
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run"));
    }
}
/*
 isPalindrome("Noon") ==> true
isPalindrome("I am not palindrome") ==> false
isPalindrome("wooden") ==> false
isPalindrome("Nurses Run") ==> true
 */
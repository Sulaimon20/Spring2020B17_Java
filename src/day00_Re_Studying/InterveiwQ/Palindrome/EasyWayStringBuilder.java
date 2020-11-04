package day00_Re_Studying.InterveiwQ.Palindrome;

public class EasyWayStringBuilder {

    public static void main(String[] args) {
        
        String str="anna";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        if(str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}

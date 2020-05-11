package OfficeHours._5_9_Saim;

public class SaimPalindromeMethod {
    public static void main(String[] args) {
        System.out.println(isPalindrome("caac"));
    }

    public static boolean isPalindrome(String str){
        //asddsa

        for (int i=0; i<str.length()/2;i++){
           if (str.charAt(i)!=str.charAt(str.length()-1-i)){
               return false;
           }
        }
        return true;

    }
}


package day25_MethodsRecap;

public class warmUp {
    //1.  write a return method that accepts a String and removes duplicate values from the String
    //		Ex:     //				RemoveDuplicate("aaabbbccc");  ==> "abc"
  //write a return method that accepts two strings str1 & str2,
    // and returns the frequency of str2 in str1 as an int
    public static void main(String[] args) {

        String str="aaaddbbbccc";
        String result1 = RemoveDuplicate(str);
        System.out.println(result1);
        String str2="AAABB";//"B"
        String str3="ABAB";
   //     int num1=Frequency(result1);

    }
    public static String RemoveDuplicate (String str){

        String result="";
        for (int i=0; i<=str.length()-1; i++) { // 0,1,2,3
            if(result.contains(""+str.charAt(i) )) {
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }



}


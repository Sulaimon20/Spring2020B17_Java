package day25_MethodsRecap;

public class warmUp3 {
    public static void main(String[] args) {
        String str = "ABAB"; // result should be AB
        String result = "";
        System.out.println(result);
    }

    public static String RemoveDuplicates(String str) {
        String result = ""; // here should be store the duplicates
        for (int i = 0; i < str.length(); i++) {//or (int i = 0; i <=str.length()-1; i++)
            char ch = str.charAt(i); //A B
            if (!result.contains("" + ch)) {      //not contained. we need to concated the char
                result += ch;
            }
        }
        return result;
    }
}




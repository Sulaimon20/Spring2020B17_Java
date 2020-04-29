package day00_ReplIt.Methods;

public class _167MethodsWithStringRemoveDuplicates {
    public static void main(String[] args) {
        //test your code

        System.out.println(uniqueChars("mama"));

    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String result="";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (result.contains(""+str.charAt(i))){
                continue;
            }else {
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
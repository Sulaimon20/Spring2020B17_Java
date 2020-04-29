package day26_Method_Overloading;

public class _166_MethodswithStringMergeThem {

    public static void main(String[] args) {
        String one = "wooden";
        String two = "spoon";

        System.out.println(mergeStrings(one,two));
    }

    public static String mergeStrings(String one, String two){
        String result="";
        int i = 0;
        while (i < one.length() && i < two.length()) {
            result = result + one.charAt(i) + two.charAt(i);
            i++;
        }
        result = result + one.substring(i) + two.substring(i);
        return result;
    }

}

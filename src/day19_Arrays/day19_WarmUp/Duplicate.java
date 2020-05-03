package day19_Arrays.day19_WarmUp;

public class Duplicate {
    public static void main(String[] args) {
        String str="AABBDDDDDFFFFWWW";
        String nonDup="";
        int count=0;
        for (int i=0; i<str.length();i++) {
            if (!str.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
            }
        System.out.println(nonDup);





    }
}

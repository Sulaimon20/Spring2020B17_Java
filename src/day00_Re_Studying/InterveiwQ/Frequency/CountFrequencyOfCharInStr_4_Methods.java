package day00_Re_Studying.InterveiwQ.Frequency;

public class CountFrequencyOfCharInStr_4_Methods {
    public static void main(String[] args) {
        String str = "AAABB";
        String chr = "A";
        int num=method1(str,chr);
        System.out.println(num);




            }
    public static int method1(String str, String chr) {
        int charCount = str.length() - str.replaceAll(chr, "").length();
        return charCount;
    }

}

package day00_Re_Studying.InterveiwQ.Reverse;

public class reverseString {
    public static void main(String[] args) {


        String word="Java is fun";
        String reverse1=""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        int lastIndex=word.length()-1;
        System.out.println(reverse1);//avaJ
        System.out.println(lastIndex);//10

        String reverse2="";
        for (int i=lastIndex; i >= 0; i--) {
            reverse2 += word.charAt(i);
            System.out.print(word.charAt(i));
        }
}
}
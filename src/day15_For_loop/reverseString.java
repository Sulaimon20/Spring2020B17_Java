package day15_For_loop;

public class reverseString {
    public static void main(String[] args) {


        String word="Java is fun";
        String reverse1=""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        int lastIndex=word.length()-1;

        String reverse2="";
        for (int i=lastIndex; i >= 0; i--) {
            reverse2 += word.charAt(i);
            System.out.print(word.charAt(i));
        }
}
}
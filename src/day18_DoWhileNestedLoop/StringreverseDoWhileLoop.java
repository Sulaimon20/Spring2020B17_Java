package day18_DoWhileNestedLoop;

public class StringreverseDoWhileLoop {
    public static void main(String[] args) {
        String str="Java";
        String reverse="";
        int lastIndex=str.length()-1;
        do {
            reverse+=str.charAt(lastIndex);

            lastIndex--;
        }while (lastIndex>=0);

        System.out.println(reverse);
    }
}
/*
for (int i=lastIndex; i >= 0; i--) {
            reverse2 += word.charAt(i);
            System.out.print(word.charAt(i));
 */
package day14_StringClass;

public class StringManipulatio4 {
    public static void main(String[] args) {
        String str="I like to J learn Java. I Like to watch bthe movie Jumanji";
        int a1=str.indexOf("J");
        System.out.println(a1);

        int a2=str.indexOf("Jum");
        System.out.println(a2);
        int a3=str.indexOf(" I")+1;
        System.out.println(a3);

        int b=str.lastIndexOf("l");
        System.out.println(b);

        String z="I like C#, C# is cool";
                       //   ___
        int c1=z.lastIndexOf("C");
        System.out.println(c1);

        String z1="I like Java, Java is fun, Java programming is fun";
        int d1=z1.indexOf("Java i");// second J index number
        System.out.println(d1);

        int d2=z1.indexOf(", J")+1+1; //second J index number
        System.out.println(d2);

        int d4=z1.indexOf("Java programming");
        System.out.println(d4);

        char ch=z1.charAt(26);//finding the letter with char number
        System.out.println(ch);
    }
}

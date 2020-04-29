package day00_ReplIt;

public class extractTheLetter {
    public static void main(String[] args) {

        String word= "Avengers";
        char first = word.charAt(0);
        String last =word.substring(word.length()-1);

        System.out.println(first+""+last);

        String txt = "foo bar";
        //your code here
        int text2= txt.indexOf("b");
        int text3= txt.indexOf("f");

        System.out.println(text2+"");
        System.out.println(text3+"");


    }

}

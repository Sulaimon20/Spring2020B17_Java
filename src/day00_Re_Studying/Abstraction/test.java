package day00_Re_Studying.Abstraction;

public class test {

    public static void main(String[] args) {

        String str="toyota";
        System.out.println("reverseWord(str) = " + reverseWord(str));

        String name="Sulaimon";
        String name1="";
        for (int i = 0; i < name.length(); i++) {
            name1+=name.charAt(i);
            if (name1.contains("m")){
                ;
            }

        }
        System.out.println("name1 = " + name1);


    }

    public static String reverseWord(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }



}

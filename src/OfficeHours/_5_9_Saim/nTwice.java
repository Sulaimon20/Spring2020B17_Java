package OfficeHours._5_9_Saim;

public class nTwice {
    public static void main(String[] args) {

        String str="AAbb";
        String result="";
        for (int i=0; i<str.length();i++){
            //result+=""+str.charAt(i)+str.charAt(i);
            result+=str.substring(i,i+1)+str.substring(i,i+1);
        }
        System.out.println(result);

        String str1="abc hi ho";
        int count=0;

        for (int i=0; i<str1.length(); i++){
            if (str1.contains("Hi")){
                count++;
            }
        }
        System.out.println(count);;





        System.out.println(nTwice("Hello", 1));
    }


    public static String nTwice(String str, int n) {
        String word = str.substring(0, n);
        String word2 = str.substring(str.length() - n);
        return word + word2;
    }
}
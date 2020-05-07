package day16_ForLoop;

public class removeDuplicates {
    public static void main(String[] args) {

        String str="AABBCCDD";
        String nonDup="";
        for (int i=0; i<str.length();i++){
            if (nonDup.contains(""+str.charAt(i))){
                continue;
            }
            nonDup+=str.charAt(i);
        }
        System.out.println(nonDup);



    }
}

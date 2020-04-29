package day00_Re_Studying.InterveiwQ.Frequency;

public class frequenceString {
    public static void main(String[] args) {
        /*
        write a program that can return the unique characters from a string
		Ex:  "AABCCAAABBBBCCCDDDEEEWWWWAASSSSS" ==> "B"
         */
        String str="AABCC"; //A2B1C2
        String result="";//A2B1C2
        String nonDup="";//ABC
    //    int count=0;// count the total number of each  character from str

        for (int i=0; i<=str.length()-1;i++){// if the character at index i is not contained in
                                                // nonDup, then it will
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }//NON DUPLICATE
        System.out.println(nonDup);//ABC
        for (int j=0; j<=nonDup.length()-1; j++){
       char ch =nonDup.charAt(j);
       int count =0;
       for (int i=0; i<str.length()-1; i++){
           if (str.charAt(i)==ch){
               count++;
           }
       }
       result+=""+ch+count;
   }
        System.out.println(result);








    }
}
/*
write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"
 */
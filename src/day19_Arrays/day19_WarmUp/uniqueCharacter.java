package day19_Arrays.day19_WarmUp;
import java.util.Scanner;
public class uniqueCharacter {
    public static void main(String[] args) {
        String str="Java, as ad";
        String result = ""; //"C", to store the unique characters
        for(int j=0; j <= str.length()-1; j++ ){
            char ch2 = str.charAt(j);
            int count = 0 ;  // to count the occurence of the character
            for(int i = 0; i <= str.length()-1; i++){
                char ch = str.charAt(i);
                if(ch == ch2){  // check how many time the character is  occured in the string
                    count++;
                }
            }
            if(count == 1){  // the the character at index J is unique , will be concated to thre sult
                result+=ch2;
            }
        }
        System.out.println(result);
    }
}

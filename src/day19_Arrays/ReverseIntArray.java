package day19_Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        // REVERSE NUMBERS
        int [] arr={1,2,3,4,5,6,7,8};
        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        //REVERSE STRING
        String word="Java Java";
        String reverse="";
        for (int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);

    //  REVERSE CHARACTERS FROM EGL ALPHABET
        char [] ch={'A','B','C','D','E'};

        for (char i='Z'; i>='A';i--){
            System.out.print(i+" ");
        }

    }

}

package Resources;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {


    }

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);// {1,2,3,4} ====> {4,3,2,1}
        int[] RevArr = new int[arr.length];
        //        i incr j - decrease
        // RevArr[0]=arr[3]
        // RevArr[1]=arr[2]
        // RevArr[2]=arr[1]
        // RevArr[3]=arr[0]
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }

    public static String Reverse(String str) {
        String Reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        System.out.println(Reverse);
        return Reverse;
    }

    public static String RemoveDuplicates(String str) {
        String result = ""; // here should be store the duplicates
        for (int i = 0; i < str.length(); i++) {//or (int i = 0; i <=str.length()-1; i++)
            char ch = str.charAt(i); //A B
            if (!result.contains("" + ch)) {      //not contained. we need to concated the char
                result += ch;
            }
        }
        return result;
    }

    public static int Frequency(String str1, String str2) {
        int count = 0;//if str1 contains str2
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");//we need to remove first index with blank;
        }   // we need to make replace that we are not counting the same index over again

        return count;
    }


    public static int Frequency (String str, char ch) {
        char[] arr = str.toCharArray();//[A,A,A]
        int count = 0;
        for (int each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }


    public static String FrequencyOfCharacters(String str) {
        String result = "";
        String NonDup = Library.RemoveDuplicates(str);//ABC


        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);// 'A'
            int n = Library.Frequency(str, ch);
            result += ch + n;
        }
        return result;
    }
}

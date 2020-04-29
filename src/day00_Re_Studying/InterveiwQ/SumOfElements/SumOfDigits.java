package day00_Re_Studying.InterveiwQ.SumOfElements;

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        String str="a1b2c3";
        //need to get each elements
        //str.toCharArray()
        //we can not use split method
        char []arr=  str.toCharArray();
        System.out.println(Arrays.toString(arr));//[a, 1, b, 2, c, 3]
        //we need to looping it
        int sum=0; //we need to store the digits in sum
        for (int each: arr){//ASCII table 48-47 is numbers from 0 to 9
            boolean isDigit=each>=48&&each<=57;
            if (isDigit){
                sum+=Integer.parseInt(""+each);//need to concate "0" convert to '0'
            }
        }
        System.out.println(sum);
        int sum1=0; //we need to store the digits in sum
        for (int each: arr){//ASCII table 48-47 is numbers from 0 to 9
            if (each>=48&&each<=57){
                sum1+=Integer.parseInt(""+each);//need to concate "0" convert to '0'
            }
        }
        System.out.println(sum1);

        boolean a=Character.isAlphabetic('A');//identifies is the charater is alphabetic




    }
}
/*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
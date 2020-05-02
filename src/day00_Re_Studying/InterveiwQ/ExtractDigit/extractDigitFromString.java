package day00_Re_Studying.InterveiwQ.ExtractDigit;

public class extractDigitFromString {
    public static void main(String[] args) {
        String str="Today's date is 04/27/2020";
        //METHOD 1

        int sum=0;
        for (int i = 0; i < str.length(); i++){
            String result = "";
            char ch= str.charAt(i);
            if (ch>=48 && ch<=57 ){
                result+=ch;
                sum+=Integer.parseInt(result);//17
            }
        }
        System.out.println(sum);

        // METHOD 2
        String num=str.replaceAll("[^0-9]", "");
        System.out.println(num);
        int num1=Integer.parseInt(num);

        int count =0; int reminder;
        while(num1 > 0) {
            reminder = num1 % 10;
            count = count+ reminder;
            num1=num1 / 10;
        }

        System.out.println(count);

       }


    }

/*
RMUP TASKS:
	1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
 */
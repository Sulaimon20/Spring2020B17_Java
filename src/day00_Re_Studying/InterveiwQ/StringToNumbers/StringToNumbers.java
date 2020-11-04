package day00_Re_Studying.InterveiwQ.StringToNumbers;

public class StringToNumbers {
    public static void main(String[] args) {

        String str = "10";
        String str1 = "10";

//        System.out.println(str + str1);//concat
//
//        System.out.println(Integer.parseInt(str) + Integer.parseInt(str1));//addition

        int numbers = sumOfDigits("abc123");
        System.out.println("numbers = " + numbers);

    }

    public static int sumOfDigits(String s) {

        int total = 0;

        char[] ch = s.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each)) {
                total += Integer.valueOf("" + each);
            }
        }
        return total;
    }


}



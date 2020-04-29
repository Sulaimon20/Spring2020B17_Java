package day00_Re_Studying.InterveiwQ.SumOfElements;

public class SumOfElementsOfWholeNumber {
    public static void main(String[] args) {
        int num1=12345;
        int count =0; int reminder;
        while(num1 > 0) {
            reminder = num1 % 10;
            count = count+ reminder;
            num1=num1 / 10;
        }
        System.out.println(count);//15
    }
}

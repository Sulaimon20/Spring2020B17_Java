package day00_SelfPractice;

public class digitReader {
    public static void main(String[] args) {


        int num= 135;
        int first  =  num % 10;
        int second =  ( num - first ) % 100 / 10;
        int third  =  ( num - first - second ) % 1000 / 100;

        System.out.print("\n The sum of the digit is: ");
        System.out.print(first+second+third+"\n");
    }
}

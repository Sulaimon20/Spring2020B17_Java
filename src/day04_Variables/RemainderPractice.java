package day04_Variables;

public class RemainderPractice {
    public static void main(String[] args) {
        //1897651 is odd number or not
        int number = 1897651;

        boolean oddNumber=number%2 !=0;
        boolean evenNumber=number%2 ==0;
        boolean divisibleBy3=number%3 ==0;

        System.out.println("the number "+number+" is odd number " + oddNumber);
        System.out.println("the number "+number+" is odd number " + evenNumber);
        System.out.println("the number "+number+" is odd number " + divisibleBy3);

    }
}

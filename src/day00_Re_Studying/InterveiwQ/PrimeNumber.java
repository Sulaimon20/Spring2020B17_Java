package day00_Re_Studying.InterveiwQ;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(primeNumber(24));

    }
    public static int primeNumber(long num) {
        int result = 2;
        if(num <= 1) {
            return result;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0 ) {
                return result;
            }
        }
        return result;
    }
}

package day00_ReplIt;

public class _237CommonDivisor {
    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


    public static int commonDivisor(int m, int n){
        //WRITE YOUR CODE HERE

       /*
        if (n == 0) {
            return m;
        }
        return commonDivisor(n, m % n);
*/
        int num = 1;
        for (int i = 1; i <= m && i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    num = i;
                }
            }

            return num;

    }
}
/*
Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer that evenly divides both m and n.
Example:
if m = 15 and n = 25, then result greatest common divisor is = 5.
 */
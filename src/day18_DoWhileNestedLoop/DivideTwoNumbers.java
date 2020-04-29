package day18_DoWhileNestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        // 10/3===>3 with a remainder of 1
        // 10 - 3 - 3 - 3 = 1
        // a=a-b= 7-3;
        //a=a-b=7-3=4;
        //a=a-b=4-3=1
        int a=15; //nominator
        int b=3; //denominator
        int count=0;//count the execution of the loop
        if (b==0){
            System.out.println("b cannot be zero");
            System.exit(0);
        }
        while (a>=b){
            a-=b; // a=a-b
            count++;// count = count +count    this needs to repeat the operation
        }
        if (a==0){
            System.out.println("The result is: "+count);
        }else {
            System.out.println("The result is "+count+" with a remainder of "+a);
        }

    }
}
/*

        // initialize dividend and divisor
        int dividend = 13;
        int divisor = 4;
        // initialize quotient
        int quotient = 0;
        //loop till the divisor does not become smaller than dividend
        while(dividend >= divisor)
        {
            dividend = dividend - divisor;
            quotient++;
        }
        // print results
        System.out.println("Quotient is "+quotient);
        // result of last subtraction
        System.out.println("Remainder is "+dividend);
 */
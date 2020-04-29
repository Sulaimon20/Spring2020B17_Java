package day24_ReturnMethods.WarmUp;
import Resources.Calculator;
import java.util.Scanner;

public class CalculatorStringArray {

    public static void main(String[] args) {

      double [] dNum={2.3, 3.5};
      double result=Calculator.multiplication(dNum[0], dNum[1]);
        System.out.println(result);
        int result1=(int)Calculator.subtraction(4,2);
        System.out.println(result1);

    }

}


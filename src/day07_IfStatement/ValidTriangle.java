package day07_IfStatement;

public class ValidTriangle {
    public static void main(String[] args) {
        double angel1=30.5;
        double angel2=50.5;
        double angel3=99;
        short SumOfAngels= (short) (angel1+angel2+angel3);
        boolean validTriangle=SumOfAngels==180;
        if (validTriangle) {
            System.out.println("The shape is triangle");
        }
        if (!validTriangle) {
            System.out.println("The shape is not valid");
        }

    }
}

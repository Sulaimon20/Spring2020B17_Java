package day24_ReturnMethods.WarmUp;
public class warmUp {
    public static void main(String[] args) {
        KmToMiles(40);
        GallonsToLitters(15);
       Calculation(10,2,"%");
       grade(90);
       palindrome("Iman");

    }
    public static void KmToMiles(double km ) {
        double result = 0.612*km;
        System.out.println((int)km+" is "+result+" miles");
    }
    public static void GallonsToLitters(double gl){
        double result = 3.75*gl;
        System.out.println((int)gl+" gallon is "+result+" litres");
    }
    public static void Calculation(int num1, int num2, String operator) {

        if (operator.equals("+")) {
            System.out.println("Addition is: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Subtraction is: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Multiplication is: " + (num1 * num2));
        } else if (operator.equals("/")) {
            System.out.println("Division is: " + (num1 / num2));
        } else if (operator.equals("%")) {
            System.out.println("Remainder is: "+num1 % num2);
        }
    }
    public static void grade(int gr){
        String result="";
        if (gr<=100&& gr>=90) {
            result="A";
        }else if (gr<=89&&gr>=80){
            result="B";
        }else if (gr<=79&&gr>=70){
            result="C";
        }else if (gr<=69&&gr>=60){
            result="D";
        }else if (gr<=59){
            result="F";

        }else{
            result="Invalid number";
        }
        System.out.println("The grade is: "+result);
    }
    public static void palindrome(String word){

        String reverseWord="";//avaJ
        for (int i=word.length()-1; i>=0; i--) {
            reverseWord+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

    }

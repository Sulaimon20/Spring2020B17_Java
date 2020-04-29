package day06_Unary_Shorthand_LogicalOperators;

public class singleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather=false;
        if(coldWeather){
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }
        boolean coronaDetected = false;
        if (coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("==================================================");

        int a =2012301;
        boolean evenNumber= a % 2 == 0;
        if (evenNumber) {
            System.out.println(a+" is an even number");
        }
        if (!evenNumber){
            System.out.println(a+" is odd number");
        }


    }
}

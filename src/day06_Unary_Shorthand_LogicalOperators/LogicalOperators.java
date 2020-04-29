package day06_Unary_Shorthand_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1=true;
        System.out.println("1. "+!result1); // =======>false

        boolean result2= 10+15>15;
        System.out.println("2. "+result2);
        System.out.println("3. "+!(result2));

        boolean result3=!true==!false;
        System.out.println("4. "+result3);

        boolean R1="Corona Virus" != "End of the World" && "Toilet paper" == "Cure";
        System.out.println("5. "+R1);

        boolean R2 = 10>15 && 15<15;

        System.out.println("6. "+R2);

        boolean R3 ='a'=='b'-1&& 'b'+1=='c';
        System.out.println("7. "+R3);

        boolean R4 = true !=false || false ==!true;
                     //  true      || true  ===> true
        System.out.println("8. "+R4);
        boolean R5 = true!=false && false ==!true;
        //              true    && true ====> false
        System.out.println("9. "+R5);

        boolean R6=!!!!!!!false; // 7! odd number
        System.out.println("10. "+R6);


    }
}

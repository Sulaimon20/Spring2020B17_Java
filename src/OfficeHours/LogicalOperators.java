package OfficeHours;

public class LogicalOperators {
    //  ||, &&, !
    public static void main(String[] args) {
        boolean r1="Muhtar" == "Bad Gay"; //false
        System.out.println("1) "+r1);
        boolean r2= "Muhtar" != "Bad Gay"; //true
        System.out.println("2) "+r2);
        boolean r3=10>=9; //true
        System.out.println("3) "+r3);
        boolean r4=!false==!true; // false
        System.out.println("4) "+r4);
        //    || operator

        boolean result1= 9!=8 || 9==8;
        //                true   false ==========> true
        System.out.println("5) "+result1);
        boolean result2= 9!=8 || 9==8;
        System.out.println("6) "+result2);
        boolean result3= 'a'=='A' || 'a'=='b';
        System.out.println(result3);


    }
}

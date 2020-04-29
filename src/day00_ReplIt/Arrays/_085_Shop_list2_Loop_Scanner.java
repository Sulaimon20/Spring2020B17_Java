package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _085_Shop_list2_Loop_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        int i=1;
        do{
            System.out.println("Enter Item"+i+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            shoppingListReport+="Item"+i+": "+item+" Price: "+price+", ";
            totalPrice+=price;
            System.out.println("Add one more item?");
            countinue=scan.next();
            i++;
            count++;
        }while((countinue.equalsIgnoreCase("yes")));
        if(countinue.equalsIgnoreCase("no")||i>10) {
            System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
            System.out.println("Total price: "+totalPrice);
        }


    }
}

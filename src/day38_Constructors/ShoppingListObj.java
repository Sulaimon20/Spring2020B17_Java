package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

    Item item1=new Item("Computer", 25,100);
        Item item2 = new Item("Apple",3,5);
        Item item3 = new Item("Orange",4,6);
        Item item4 = new Item("Egg",5,1);
        Item item5 = new Item("Apron",10,1);
    // Item item2=new Item(Paper)
        System.out.println(item1.calCost());
        System.out.println(item1);

        ArrayList<Item> shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4));
        double totalCost=0;
    // solution 1 for each loop

        for (Item each:shoppingList){
            totalCost+=each.calCost();
        }
        System.out.println(totalCost);
    // solution 2 for loop

    for (int i=0; i<shoppingList.size(); i++){
        totalCost+=shoppingList.get(i).calCost();
    }
        System.out.println("Total "+ totalCost);
    }
}

package day34_Custom_Class.PizzaStore;

import day34_Custom_Class.PizzaStore.PizzaCustom;

public class PizzaObject {
    public static void main(String[] args) {
        PizzaCustom order=new PizzaCustom();
        order.customizeOrder("medium",10,5);
        System.out.println(order);

    }
}

package day38_Constructors;

import java.text.DecimalFormat;

public class Item {
    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity
				*/
    String name;
    double unitPrice;
    int quantity;

    //this is initializion of instance variables
    //this keyword refers to object instances

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }

    public double calCost(){

      return unitPrice*quantity;

    }

    public String toString (){
        return "Name of Item: <<"+name+ ">> Price of item: <<$"+unitPrice+">> Quantity: <<"+quantity+ ">> total sum: <<$" +calCost()+">>";  }

    public static void main(String[] args) {

        Item newItem=new Item("Radio", 2015,1);

        System.out.println(newItem);
    }

    /*
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */
}

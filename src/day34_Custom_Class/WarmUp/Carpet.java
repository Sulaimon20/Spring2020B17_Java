package day34_Custom_Class.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Carpet {
//instance variable
    String name;
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    int quantity;

//this constructor we use for calculation
    public double calCost(){
        double total=(width+length)*unitPrice;
        return (isPersian) ? total+200 : total;

    }

    // (w+l)*unitPrice
    public void customOrder(String name, double carpetWidth, double carperLength, double carpetUnitPrice, boolean carpetPersian,int quantity){
        this.name=name;
        width=carpetWidth;
        length=carperLength;
        unitPrice=carpetUnitPrice;
        isPersian=carpetPersian;
        this.quantity=quantity;
      }
      //this is for print statement
      public String toString (){
       return "Name:"+name+
               "\nLenth: "+length+
               "\nWedgth "+width+
               "\nUnit price $"+unitPrice+
               "\nCost of carpet: $"+calCost()+
                "\nQuantity: "+quantity;

    }

    public static void main(String[] args) {
    Carpet item1=new Carpet();
        Carpet item2=new Carpet();
        Carpet item3=new Carpet();
        Carpet item4=new Carpet();

        item1.customOrder("Shah",21,21,120,true,8);
        item2.customOrder("Malik",21,21,120,true,6);
        item3.customOrder("Rag",21,21,120,true,12);
        item4.customOrder("Classic",21,21,120,true,15);

       // System.out.println(item1);

        ArrayList<Carpet>list=new ArrayList<>(Arrays.asList(item1,item2,item3,item4));
        String result="";
        for (Carpet each:list){
            result+=" "+each.name+" | "+each.unitPrice;
        }
        System.out.println(result+"\n");
        int numbers=0;
        for (Carpet each:list){
            numbers+=each.quantity;
        }
        double count =0;
        for (Carpet each:list){
            count+=each.unitPrice*each.quantity;
        }
        System.out.println("total value of "+numbers +" carpets in the store is: "+count);




        System.out.println(numbers);


    }

}

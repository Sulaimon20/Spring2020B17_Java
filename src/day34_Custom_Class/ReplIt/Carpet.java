package day34_Custom_Class.ReplIt;

import java.text.DecimalFormat;

public class Carpet {
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    public Carpet(){

        width=300;
        length=300;
        totalPrice=(int)200;
        isPersian=false;
        unitPrice=(int)0;
    }
    public Carpet(double width, double length, double unitPrice, boolean isPersian){

        this.width=width;
        this.length=length;
        this.isPersian=isPersian;
        this.unitPrice=(int)unitPrice;
        totalPrice=((int)width+(int)length)*(int)unitPrice;
        if (isPersian){
            totalPrice+=(int)200;
        }

    }

    public static void main(String[] args) {
        Carpet c = new Carpet();
        System.out.println(c.totalPrice); // 200


        Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
        System.out.println(c2.totalPrice); // 80
       // the calculation:(20+20)*2


        Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
        System.out.println(c3.totalPrice); // 280

        //the calculation:(20+20)*2 +200
    }



}

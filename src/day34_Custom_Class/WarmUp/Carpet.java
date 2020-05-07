package day34_Custom_Class.WarmUp;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calCost(){
        double total=(width+length)*unitPrice;
        return (isPersian) ? total+200 : total;

    }

    // (w+l)*unitPrice
    public void customOrder(double carpetWidth, double carperLength, double carpetUnitPrice, boolean carpetPersian){
        width=carpetWidth;
        length=carperLength;
        unitPrice=carpetUnitPrice;
        isPersian=carpetPersian;
      }
      public String toString (){
       return "Lenth: "+length+
               "\nWedgth "+width+
               "\nUnit price $"+unitPrice+
               "\nCost of carpet: $"+calCost();

    }


}

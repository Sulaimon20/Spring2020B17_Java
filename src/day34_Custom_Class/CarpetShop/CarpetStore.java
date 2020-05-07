package day34_Custom_Class.CarpetShop;

public class CarpetStore {
    int width;
    int length;
    double unitPrice;
    boolean isPersian;
public void customOrder(int carpWidth, int carpLength, double carpUnitPrice, boolean carpIsParsian){
    width=carpWidth;
    length=carpLength;
    unitPrice=carpUnitPrice;
    isPersian=carpIsParsian;
}
public double calcCost() {
    double totalPrice =(width+length)*unitPrice;
    if (isPersian){
        totalPrice+=200;
    }

return totalPrice;
}
public String toString(){
    return "Width of the carpet: "+width+"\nlength of the carpet: "
            +length+"\nPrice: "+calcCost();
}


}

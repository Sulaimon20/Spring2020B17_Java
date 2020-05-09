package OfficeHours._5_9_Saim;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1=new BestBuy();
        store1.numberOfComputers=10;
        BestBuy.numberOfComputers--;

        System.out.println(BestBuy.numberOfComputers);

        store1.close();
        BestBuy.closeAll();



    }
}

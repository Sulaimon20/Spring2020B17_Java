package day37_Constructors.Replit;

public class Stock {

   String  tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;




    public Stock(String  tickerSymbol, String companyName, int price,  int totalShares){
        this.tickerSymbol=tickerSymbol.toUpperCase();
        this.companyName=companyName;
        this.price=price;
        this.totalShares=totalShares;
        marketCap=totalShares*price;
    }

    // DO NOT CHANGE THE METHOD BELOW
    public void adjustPrice(int value){
        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;
    }
    public String toString() {
        return "Ticker Symbol: " + tickerSymbol +
                "\nCompany: " + companyName +
                "\nCurrent Price: $" + price +
                "\nMarket Cap: " + marketCap;
    }


    public static void main(String[] args) {

        Stock obj=new Stock("goog", "Google, Inc.",10,100);
        obj.price=802;
        obj.totalShares=2000;
        obj.adjustPrice(234);

        System.out.println(obj);

    }






}

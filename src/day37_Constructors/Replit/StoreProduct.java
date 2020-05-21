package day37_Constructors.Replit;

public class StoreProduct {
    String label;
    int price;
    String  category;
    boolean  hasExpiration;
    int stock; //(represents how many the store has available)
    //1
    public StoreProduct(String label, int price, String category,
                        boolean hasExpiration){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        stock=0;
    }
    //2
    public StoreProduct(String label, int price) {
        this.label = label;
        this.price = price;
        category="misc";
        hasExpiration=!true;
        stock=0;

    }
    //3
        public StoreProduct(String label, int price, int stock){
            this.label=label;
            this.price=price;
            category="misc";
            hasExpiration=!true;
            this.stock=stock;
        }


    //4
    public StoreProduct(String label, int price, String category, boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;

    }
    public void expired(boolean hasExpired){
        if (hasExpired){
            stock=0;
        }
    }

    public boolean sale(int quantity){

        if (quantity<=stock){
            stock=stock-quantity;
            return true;
        }else{
            return false;
        }
    }
    public double getDiscount(double discount){
    double discResult=price*(1-discount);
    return discResult;
    }


    public static void main(String[] args) {
        StoreProduct p=new StoreProduct("Paper",23);
        System.out.println(p.getDiscount(1.0));

    }
}

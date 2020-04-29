package day00_ReplIt.Methods;

public class _159 {
    public static void main(String[] args) {
        int buyPrice=1000;
        int sellPrice=100;
        String result = c_profits(buyPrice,sellPrice);
        System.out.println(result);
    }
    public static String c_profits(int buyPrice, int sellPrice) {
        //your code here

        if (buyPrice > sellPrice) {
            return  "profit";
        } else if (buyPrice < sellPrice) {
            return "loss";
        } else {
            return "no loss";
        }
    }
}

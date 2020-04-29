package day00_ReplIt.Methods;

public class _159_Methods_with_return_4 {

    public static String c_profits(int buyPrice, int sellPrice) {
        //your code here

        String result="";
        if (buyPrice > sellPrice) {
            return  "profit";
        } else if (buyPrice < sellPrice) {
            return "loss";
        } else {
            return "no loss";
        }
    }

    public static void Main (String [] args){

        int buyPrice=100;
        int sellPrice=100;
        String result = c_profits(buyPrice,sellPrice);
        System.out.println(result);

    }

}

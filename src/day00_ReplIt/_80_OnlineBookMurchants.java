package day00_ReplIt;

import java.util.Scanner;

public class _80_OnlineBookMurchants {
    public static void main(String[] args) {
            int freeBooks = 0;
            Scanner scan = new Scanner(System.in);
           boolean isPremiumCustomer = scan.nextBoolean();

           if (isPremiumCustomer==true){
                int nbooksPurchased = scan.nextInt();
                if (nbooksPurchased>=5&&nbooksPurchased<8){
                    freeBooks=1;
                }else if(nbooksPurchased>=8){
                    freeBooks=2;
                }
            }if (isPremiumCustomer!=true) {
            int nbooksPurchased = scan.nextInt();
            if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
                freeBooks = 1;
            } else if (nbooksPurchased >= 12) {
                freeBooks = 2;
            }
        }
        System.out.println(freeBooks);

    }
}

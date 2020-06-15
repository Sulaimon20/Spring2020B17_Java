package day00_ReplIt.Arrays;

public class badProduct {


    public static void main(String[] args) {

        int[] products = {1, 1, 1, 1, 0, 0};
        int limit = 6;
        System.out.println(badP(products, limit));


    }

    public static boolean badP(int[] products, int limit) {
        int count0 = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] == 0) {
                count0++;
            }
        }
        if (count0 < limit) {// 2>1
           return true;
        } else {
           return false;
            }

        }

        }



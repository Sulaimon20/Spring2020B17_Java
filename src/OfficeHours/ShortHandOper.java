package OfficeHours;

public class ShortHandOper {
    public static void main(String[] args) {

        int x = 5;
        //x = x * 3; // 15
        x *= 3;
        System.out.println("1) "+x);
 //===============================================
        // division
        int n=900;
        n=n/3;
        System.out.println("2) "+n);
//=============================================
        int z=100;
        z = z++ + --z - z-- + ++z;
          //100 + 100 - 100 + 100
        System.out.println("3) "+z);
        int u=900;
        int r= - ++u + ++u + -u++;
        //       -901 + 902+ -902
        System.out.println("4) "+r);
 //++++++++++++++++++++++++++++++++++++++++++++++


    }
}

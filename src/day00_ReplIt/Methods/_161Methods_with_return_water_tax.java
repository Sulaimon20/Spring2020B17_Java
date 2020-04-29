package day00_ReplIt.Methods;

public class _161Methods_with_return_water_tax {

    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        double regular=0.60;
        double UpperRegular=0.90;
        int resularfine=50;
        int doubleFine=100;
    if (units<=50){
        bill= units*regular;
    }else if (units>50&&units<100){
        bill= units*UpperRegular;
    }else if (units>100&&units<150){
        bill= (units*UpperRegular)+resularfine;
    }else {
        bill= (units*UpperRegular)+doubleFine;
    }

        //end your code here


        return bill;
    }//end waterTax


}

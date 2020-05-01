package day00_ReplIt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _190MethodswithArrayList11appendPosSum {
    public static void main(String[] args)     {
        ArrayList<Integer>a =new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));

    }
    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> num = new ArrayList();
        for (int each : list) {
            if (each > 0) {
                num.add(each);
            }
        }
        Integer number=0;
        for (int i=0; i<num.size();i++){
            number+=num.get(i);
        }
        num.add(number);
        return num;
    }

}




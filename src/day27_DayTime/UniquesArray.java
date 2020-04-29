package day27_DayTime;

public class UniquesArray {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3};//2
        //          0 1 2 3 4

uniqueElements(arr);

    }
    public static void uniqueElements(int [] arr){
        for (int each2: arr){// outer loop for counting unique number
            int count =0;
            for (int each: arr ){//inner loop for counting index zero if it is unique one
                if (each == arr[each2]){
                    count++;// 1,1=2
                }
            }
            if (count==1){//if 1 is unique
                System.out.println(arr[each2]);
            }
        }

    }




}

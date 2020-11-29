package day00_Re_Studying.Arrays;

public class _2_smallestNumInArray {

    public static void main(String[] args) {
        int array[] = {10, 20, 25, 63, 96, 57};
        System.out.println("array = " + array);
    }
    public static int secondSmall(int [] array){
        int temp;

        for(int i = 0; i<array.length; i++ ){
            for(int j = i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }


}

package day00_Re_Studying.Exam;

public class _17_array_multi {
    public static void main(String[] args) {
        int [][]arr=new int [2][4];
        arr[0]=new int []{1,3,5,7};
        arr[1]=new int []{1,3};

        for (int []a:arr){//1,3,5,7
            for (int i:a){//1,3
                System.out.println(i+" ");
            }
            System.out.println();
        }
//1,3,5,7   1,3


    }
}

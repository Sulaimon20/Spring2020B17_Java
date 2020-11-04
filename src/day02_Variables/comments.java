package day02_Variables;

public class comments {
    public static void main(String[] args) {


        System.out.println("getSequenceSum(5,9,6) = " + getSequenceSum(5, 9, 6));
    }
    static long getSequenceSum(int i, int j, int k) {
        long sum1=i;
        for(int a=0;a<=j-i;a++){
            sum1+=i+a;
        }
        long sum2=0;
        for(int b=j-k;b>=1;b--){
            sum2+=(j-b);
        }
        return sum1+sum2;
    }
}

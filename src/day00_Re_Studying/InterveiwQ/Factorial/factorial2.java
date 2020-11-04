package day00_Re_Studying.InterveiwQ.Factorial;

public class factorial2 {
    public static void main(String[] args) {
        int x = 5; //1*2*3*4*5
        long y = 1;
        for (int i = 1; i <= x; i++) {
            y = y*i;
        }
        System.out.println(y+" ");
    }
}
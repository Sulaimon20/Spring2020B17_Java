package day00_ReplIt.Methods;

public class _157_minMaxReturnMethod {
    public static void main(String[] args) {

        int result =max(1,10);
        System.out.println(result);
    }

    public static int max(int x, int y) {

        if (x > y) {
            return y;
        } else {
            return x;
        }

    }
}
package day00_Re_Studying.InterveiwQ.Swap;

public class SwapNums {

    public static void main(String[] args) {
        System.out.println("Calling swap function with inputs 4 & 5");
        swap(4,5);
        System.out.println("Calling swap function with inputs 0 & 8");
        swap(0,8);
    }

    private static void swap(int x, int y) {
        System.out.println("values before swap:" + x + " and " + y);
        // swap logic
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("values after swap:" + x + " and " + y);
    }

}

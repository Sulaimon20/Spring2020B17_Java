package day00_Re_Studying.InterveiwQ;

public class Overload {

    public static void main(String[] args) {
        int x = 0;
        int y = 17;
        for (int i = 0; i <= 45; i++) {
            if (i % 2 != 0) {
                y += 2;
            } else {
                i = i / x;
            }
        }

    }
}


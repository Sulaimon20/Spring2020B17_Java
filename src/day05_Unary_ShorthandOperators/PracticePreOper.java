package day05_Unary_ShorthandOperators;

public class PracticePreOper {
    public static void main(String[] args) {
        int a = 50; //49
        a = --a + a++ + a-- + a++;
        //  49  +49   + 50  + 49=197
        System.out.println(a);
        int x=4;
        int y = x*4 - x++; // 16-4=12
        System.out.println(y);

        int a1=1;
        a1  =-a1-- + a1++ / -a1-- * --a1; //
        //    -1   +  0   /  -1   *  - 1
        //    -1   +  0   /  - 1
        //     -1
        System.out.println(a1);



    }
}

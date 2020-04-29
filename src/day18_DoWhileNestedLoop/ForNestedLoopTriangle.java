package day18_DoWhileNestedLoop;

public class ForNestedLoopTriangle {
    public static void main(String[] args) {
        int outerLoop=0;
        int innerLoop=0;
        for (outerLoop=1; outerLoop<10; outerLoop++){
            for (innerLoop=1; innerLoop<outerLoop; innerLoop++){
                System.out.print("*");
            }
            System.out.println();
        }



        for (; outerLoop>=0; outerLoop--){
            for (innerLoop=1; innerLoop<outerLoop; innerLoop++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

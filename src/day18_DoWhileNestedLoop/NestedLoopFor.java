package day18_DoWhileNestedLoop;

public class NestedLoopFor {
    public static void main(String[] args) {
        for (int z=0; z<5; z++){
            for (int i=0; i<=5; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for (int r=0; r<=7; r++){
            for (int w=0; w<=5; w++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
}

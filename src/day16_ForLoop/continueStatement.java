package day16_ForLoop;

public class continueStatement {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){

            if (i==3){
                continue;//skip 3 in the iteration
            }
            System.out.print(i+" ");
        }
        System.out.println(" ");

        for (int i=1; i<=20; i++){
            if (i%2 != 0){ // skips all the odd number
                continue;
            }
            System.out.print(i+" ");
        }

    }
}

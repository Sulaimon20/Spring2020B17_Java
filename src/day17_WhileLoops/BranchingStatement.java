package day17_WhileLoops;

public class BranchingStatement {
    public static void main(String[] args) {
        // System.exit(0):

        for (int i=0; i<5; i++){
            if (i%2!=0){
                System.exit(0);// if the previous condition is true, it stops everything. Otherwise, not
            }
            System.out.println(i);
        }
        System.out.println("Test");
    }
}

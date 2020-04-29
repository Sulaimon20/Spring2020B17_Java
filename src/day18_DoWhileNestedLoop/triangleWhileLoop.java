package day18_DoWhileNestedLoop;

public class triangleWhileLoop {
    public static void main(String[] args) {

            for (int i=0; i<=5; i++){
                for (int z=0; z<=5;){
                    System.out.print("* ");
                    z++;
                }
                System.out.println("");
            }

        System.out.println("=============================================");


        int z=7;
        while(z<=1){

            int i=1;
            while(i>=z){
                System.out.print("* ");
                i++;
            }
            System.out.println(" ");
            z--;
         }


    }
}

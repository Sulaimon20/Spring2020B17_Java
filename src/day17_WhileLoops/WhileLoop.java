package day17_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
   //
            System.out.print(i+" ");
        }
        System.out.println();
        int i=0;
        while (i<=5) {
            System.out.print(i+" ");
            i++;//should be here not before: sout result=5 in this case
        }
        System.out.println("");
        if (true) {
            System.out.print("Hello");
        }
        while (true){
            System.out.println("Hello");
        }
    }
}

/*
 while (10>9){
         System.out.println(".");//executes infinite time
         }

         if (10>1){

            System.out.println("Hello World");//executes just once
        }
 */
package day23_Methods;

public class MethodsPractice1 {
    public static void main(String[] args) {
        evenNumbers();
        System.out.println();
        oddNumbers();
        System.out.println();
        deference();


    }

    public static void evenNumbers(){
        for  (int i=1; i<100; i++){
            if (i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    public static void oddNumbers() {

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }
        public static void deference(){


            for (int i = 1; i < 100; i++) {
                i=i+2;
                System.out.print(i + " ");
            }
            }



        }


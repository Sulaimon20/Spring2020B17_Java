package day44_Exceptions;

public class try_catchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Test started");

        try {
            Thread.sleep(15000);
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("catch block");//does not compiled
        }

        System.out.println("Test completed");
    }
}

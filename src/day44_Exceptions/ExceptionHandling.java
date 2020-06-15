package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String result="";
                try {
            System.out.println(100/0);
        }catch (ArithmeticException e){
            result+=e.getMessage();
        }
        System.out.println(result);
        System.out.println("Completed");

    }
}

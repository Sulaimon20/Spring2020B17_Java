package day45_Exceptions;

class BreakTimeException extends RuntimeException{ //this is custom unchecked exception class
        public BreakTimeException(){
            super("It is break time, we should take a breat");
        }
    public BreakTimeException(String a){
        super("It is break time, we should take a breat");
    }
}
public class CustomException {
    public static void main(String[] args) {

        boolean breakTime=true;
        if (breakTime){
            throw new BreakTimeException("Lets have a break time");//throw keyword can only used if the exception class is extended
        }else{
            System.out.println("Continue the class");
        }
        throw new RuntimeException("It is break time, we should take a break");


    }

}

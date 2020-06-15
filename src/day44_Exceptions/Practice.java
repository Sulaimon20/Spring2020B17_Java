package day44_Exceptions;

public class Practice {


    public static void main(String[] args) {
/*
print hello,
wait 2 seconds,
print Cybertek
wait three second
 */
        System.out.println("Hello");

       try{
                Thread.sleep(2000);
       }catch (Exception e){

       }
        System.out.println("Cybertek");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("Java");
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("completed");

    }
}

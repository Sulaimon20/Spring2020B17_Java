package day45_Exceptions;

public class warmUp {
    public static void main(String[] args) {

        int pushUps=0;
        while(pushUps<20){
            System.out.println("Pushup "+(pushUps+1));
            try {
                Thread.sleep(3000);
            }catch (Exception e){

            }
            pushUps++;
        }
    }
}

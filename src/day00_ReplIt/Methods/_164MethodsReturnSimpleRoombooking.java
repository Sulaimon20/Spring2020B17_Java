package day00_ReplIt.Methods;

public class _164MethodsReturnSimpleRoombooking {

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        if (isAvailable==false){
            return false;
        }if (month==7&&day<=8){
            return false;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(simpleRoomBook(false, 2,1,2018));
    }
}

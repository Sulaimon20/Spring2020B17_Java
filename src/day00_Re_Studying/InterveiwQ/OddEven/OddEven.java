package day00_Re_Studying.InterveiwQ.OddEven;

public class OddEven {

    public static String oddOrEven(int a){

        String odd="Odd", even="Even";

        if (a%2==0){
            return odd;
        }else {
            return even;
        }


    }


    public static void main(String[] args) {
        System.out.println(oddOrEven(3));
    }
}

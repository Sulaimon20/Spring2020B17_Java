package day00_ReferenceQuiz.Quiz2;

public class _3 {
    public static void main(String[] args) {
        boolean A=true, B=!A;
        if(A){
            if(B){
                System.out.println("Monday");
            }else {
                System.out.println("Tuesday");
            }
        }else {
            if (A){
                System.out.println("Thursday");
            }else {
                System.out.println("Friday");
            }
        }
    }
}

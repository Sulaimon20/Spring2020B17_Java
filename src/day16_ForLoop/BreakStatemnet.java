package day16_ForLoop;

public class BreakStatemnet {
    public static void main(String[] args) {
        for (int i=1; i<5; i++) {
         if (i==3){
             break;
         }
            System.out.println("Hello world");
               }
    for (char i='a'; i<='z'; i++){
        if (i=='e'){
            break;
        }
        System.out.println(i);
    }
    }
}

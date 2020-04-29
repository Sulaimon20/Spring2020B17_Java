package day18_DoWhileNestedLoop;

public class do_While_Loop2 {
    public static void main(String[] args) {

        int num=103; // print from 103 to 100
        int i=0;
        while (num>=100){
            System.out.print(num+" ");
            num--;
        }
        System.out.println("\n===============");
            int num2=103;
        do{
            System.out.print(num2+" ");
            num2--;
        }while (num2>=100);


    }
}

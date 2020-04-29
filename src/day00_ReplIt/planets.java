package day00_ReplIt;
import java.util.Scanner;
public class planets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus\nb)pluto\nc)neptune");
        String answer = s.nextLine();
        //your code here

        if ( answer.equals("a")||answer.equals("c")) {
            System.out.println(answer+" is wrong");
            }else if (answer.equals("b")){
            System.out.println(answer+" is correct");
         } else  {
                System.out.println(answer+" is not valid answer");
            }
        }
    }
/*

            if (answer.contains("a")) {

             } {

 */
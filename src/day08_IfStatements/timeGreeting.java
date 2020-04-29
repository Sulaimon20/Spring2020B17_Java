package day08_IfStatements;

public class timeGreeting {
    public static void main(String[] args) {
        int x = 18;
        if (x <= 12 && x >= 6) {
            System.out.println("Good morning");
        }
        else if (x>=12&&x<=15){
            System.out.println("Good afternoon");
        }
        else if (x<=18&&x>=20){
            System.out.println("Good evening");
            }
        else {
            System.out.println("Good evening");
        }
    }
}

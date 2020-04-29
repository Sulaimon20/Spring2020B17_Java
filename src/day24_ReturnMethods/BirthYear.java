package day24_ReturnMethods;

public class BirthYear {
    public static void main(String[] args) {
        Age(1979);
        printHelloCybertek();
    }
    public static void Age(int birthYear){

        int currentYear=2020;
                if (birthYear<currentYear&&birthYear>1920) {
            int age = currentYear - birthYear;
            System.out.println(age);
        }else{
            System.out.println("You are not born yet");
        }
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek(){
        printHello();
        printCybertek();
    }
}

package OfficeHours._4_22_Methods;

public class void_methods {
    public static void main(String[] args) {
        boolean UScitizen=true;
        int age=21;
        Vote(21, true);
    }
    public static void print(){}

    public static void Vote(int age, boolean UScitizen){
        boolean eligibleToVote=age >=18 && UScitizen ==true;
        if (eligibleToVote=true){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote yet");
        }
        }

}

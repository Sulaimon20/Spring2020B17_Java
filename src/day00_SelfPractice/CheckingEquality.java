package day00_SelfPractice;
public class CheckingEquality {
    public static void main(String[] args) {
        double n1=32;
        double n2=32;
        double n3=32;

        if (n1==n2&& n1!=n3 ) {
            System.out.println("n1 and n2 are equal");
        }
        else if (n2 == n3 && n1 != n2){
            System.out.println("n2 and n3 are equal");
        }
        else if (n3 == n1&& n3!= n1){
            System.out.println("n3 and n1 are equal");
        }
        else if (n1==n2 && n2==n3){
            System.out.println("All of them are equal");
        }
        else {
            System.out.println("None of them are equal");
        }
    }

}
/*
write a program that can check the equality of the three given numbers
            declare 3 numbers n1, n2, n3
            if n1 and n2 are equal  => n1&n2 are equal

            if n2 and n3 are equal ==> n2&n3 are equal
            if n3 and n1 are qual ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal
 */
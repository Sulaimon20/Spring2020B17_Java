package day00_SelfPractice;

public class MediumNumber {
    public static void main(String[] args) {
        int a = 1000;
        int b = 100;
        int c = 3;
        if (a < b &&  a>c || a>b && a<b) {
            System.out.println(a+" is medium number");
        }
        if (b<a && b>c || b>a&& b<c){
            System.out.println(b+" is medium number");
        }
        if (c<a && c>b|| c>a && c<b){
            System.out.println(c+" is medium number");
        }
    }
}


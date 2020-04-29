package day00_SelfPractice;

class MinimumNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 3;
        if (a < b && a < c) {
            System.out.println(a+" is minimun number");
        }
        if (b<a&&b<c){
            System.out.println(b+" is minimum number");
        }
        if (c<a&&c<b){
            System.out.println(c+" is minimum number");
        }
    }
}


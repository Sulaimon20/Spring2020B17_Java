package day00_SelfPractice;

class MaxNumber {
    public static void main(String[] args) {
        double a = 23;
        double b = 50;
        double c = 43;

        boolean aGreater=a > b && a > c;
        boolean bGreater=a > b && a > c;
        boolean cGreater=a > b && a > c;

        if (a > b && a > c) {
            System.out.println(a+" is maximum number");
        }
        if (b>a&&b>c){
            System.out.println(b+" is maximum number");
        }
        if (c>a&&c>b){
            System.out.println(c+" is maximum number");
        }
    }
}

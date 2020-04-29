package day06_Unary_Shorthand_LogicalOperators;

public class ifStatementPractice {
    public static void main(String[] args) {
        int a =200;
        int b =200;
        if (a>b){   //false
            System.out.println(a+" is greater then "+b);
        }
        if (a<b){
            System.out.println(b+" is greater them "+a);
        }
        if (a==b) {
            System.out.println(a + " is equal to " + b);
        }
        if (a>b && b<a && a==b){
            System.out.println("");
                    }
        int x=200;
        int y=300;
        boolean xGreater=x>y;
        boolean yGreater=x<y;
        if (xGreater){
            System.out.println(x+" is greater then "+y);
                    }
        if (yGreater){
            System.out.println(y+" is greater then "+x);
        }
        if(xGreater ==false&&yGreater==false){
            System.out.println(x+" is equal to "+y);
        }




        //
    }
}

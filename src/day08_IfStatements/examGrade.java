package day08_IfStatements;

public class examGrade {
    public static void main(String[] args) {
        int x=199;

        boolean grade1=x<60&&x>0;
        boolean grade2=x>=60 && x<=90;
        boolean grade3=x>=90&&x>=100;

        if (x<60&&x>0){
            System.out.println("Fail");
        }
        else if(x>=60&& x<90) {
            System.out.println("Pass");
        }
        else  {
            System.out.println("Passed with Distinction");
        }
    }
}

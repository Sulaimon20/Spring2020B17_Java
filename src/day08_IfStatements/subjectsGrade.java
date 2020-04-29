package day08_IfStatements;

public class subjectsGrade {
    public static void main(String[] args) {
        double sub1=90;
        double sub2=30;
        double sub3=90;
        double aver=(sub1+sub2+sub3)/3;

        if (aver >= 90 && aver <= 100){
            System.out.println("A");
        }
        else if (aver >= 80 && aver <=89){
            System.out.println("B");
        }
        else if (aver >= 70 && aver <=79){
            System.out.println("C");
        }
        else if (aver >=60 && aver <= 69){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}

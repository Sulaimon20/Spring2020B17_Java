package day35_Static;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student();
        System.out.println(student1);//Name: null School Name: Cybertek


        Student student2=new Student();
        student1.name="Muhtar";

        Student student3=new Student();
        student3.name="Quzzat";

    }


}

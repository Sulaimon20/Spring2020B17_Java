package day34_Custom_Class.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student=new Student();
        student.setStudentInfo("Adam", "UK", 34, 3.4, 'M',true);

        Student student2=new Student();
        student2.setStudentInfo("Mike", "USA", 23, 3.0, 'M',false);

        Student student3=new Student();
        student3.setStudentInfo("Liz", "USA", 39, 2.6, 'F',false);

        Student student4=new Student();
        student4.setStudentInfo("Anna", "Ukraine", 33, 3.1, 'F',true);

        Student [] students = {student,student2,student3,student4};

        ArrayList<Student> canGraduate= new ArrayList<>(Arrays.asList(students));


        canGraduate.removeIf(p -> p.gpa<=3.0);
      //  System.out.println(canGraduate);
        for (int i=0; i<canGraduate.size();i++){
            Student each=canGraduate.get(i);
            System.out.println(each.name+ " can graduate");
        }
        System.out.println("=========================");

        ArrayList<Student> canNotGraduate= new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p -> p.gpa>3.0);

        for (int i=0; i<canNotGraduate.size();i++){
            Student each=canNotGraduate.get(i);
            System.out.println(each.name+ " can not graduate");
        }

    }
}

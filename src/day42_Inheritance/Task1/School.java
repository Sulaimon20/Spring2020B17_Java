package day42_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
/*
    create 3 objects of student and set thier info
    create a an ArrayList of students to store all student objects
    use for each loop to print out each students' name and studentID

 */
public static void main(String[] args) {


    Student student1 = new Student();
    student1.name="Kim";
    student1.age=23;
    student1.gender='F';
    student1.studentID=123456;
    student1.clazz="Batch12";

    Student student2 = new Student();
    student2.name="Tim";
    student2.age=29;
    student2.gender='M';
    student2.studentID=123457;
    student2.clazz="Batch12";

    Student student3 = new Student();
    student3.name="Rim";
    student3.age=21;
    student3.gender='M';
    student3.studentID=123458;
    student3.clazz="Batch12";

    ArrayList<Student>list=new ArrayList<>();
    list.addAll(Arrays.asList(student1));
    list.addAll(Arrays.asList(student2));
    list.addAll(Arrays.asList(student3));

    for (Student each: list){
        System.out.println(each.name+" "+each.studentID);

    }


}
}


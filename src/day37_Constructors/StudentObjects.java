package day37_Constructors;

public class StudentObjects {



    public static void main(String[] args) {
        Student student= new Student("Sulaimon", 40, 'M', "Cybertek");

        Student student1=new Student("Solin", 32, 'F', "Yale");
        System.out.println(student+"\n"+student1);
    }
}

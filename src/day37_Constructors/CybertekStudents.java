package day37_Constructors;

public class CybertekStudents {
    //static variable = global variable, we can use them everywhere

    static String schoolName="Cybertek University";
    //instance variable
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch) {
        //schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;

    }

    public String toString() {
        return "Name: <<" + studentName + ">> Batch <<" + batch + ">> in group N: <<" + groupNumber + ">> School name: <<" + schoolName+">>";
    }

}

    class CObjects {
        public static void main(String[] args) {
              CybertekStudents student1 = new CybertekStudents("Sulaimon", 3, "18");
                    student1.batch="18";
                    System.out.println(student1);

              CybertekStudents student2 = new CybertekStudents("Sam", 3, "18");
                    System.out.println(student2);

                    CybertekStudents student3 = new CybertekStudents("Fuu", 3, "18");
                    System.out.println(student3);
        }
    }

















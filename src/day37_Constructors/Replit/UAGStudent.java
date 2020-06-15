package day37_Constructors.Replit;

public class UAGStudent {
    String name;
    int grade;
    static String principalName= "Ms. McKoy";
    String studentID;
    static int nextID =100;

    public UAGStudent(String name, int grade){
        this.name=name;
        this.grade=grade;
        System.out.println(studentID=name.substring(0,1).toUpperCase()+nextID);
        nextID++;
    }
    public static void newPrincipal(String newPrincipal){
       principalName=newPrincipal;
    }
    static void resetID(){
        nextID=100;
    }


    public String toString() {
        return  name +" " + studentID ;
    }

    public static void main(String[] args) {
        UAGStudent student1=new UAGStudent("Muhammed", 11);
        UAGStudent student2=new UAGStudent("Alan", 11);
        UAGStudent student3=new UAGStudent("Sophie", 11);
        System.out.println(student1.studentID);

        System.out.println(student1);
        UAGStudent.resetID();
        UAGStudent student4=new UAGStudent("kevin", 11);
        System.out.println(student4);


    }



}

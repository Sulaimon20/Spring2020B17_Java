package day50_Polymorphism;

public interface onlineEducation {
    boolean onlinesStudent=true;
    abstract void attendClass();

}
interface Cybertek extends onlineEducation{
    String schoolName="";
    boolean requiresITBackGround=true;}
class Student implements onlineEducation, Cybertek{
    private String studentName;
    private int Age;

    private int grade;
    private boolean has_ITBackround=true;

    public Student(){

    }

    public String getSchoolName() {
        return studentName;
    }
    public void setSchoolName(String schoolName) {
        this.studentName = schoolName;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public boolean isHas_ITBackround() {
        return has_ITBackround;
    }
    public void setHas_ITBackround(boolean has_ITBackround) {
        this.has_ITBackround = has_ITBackround;
    }
    @Override
    public void attendClass() {

    }

    public static void method(){

    }
    @Override
    public String toString() {
        return "Student name: "+studentName+", Name of school: "+schoolName+", Age: "+Age+", Grade: "+grade+
                ", IT backround: " + has_ITBackround;
    }
    public void studying(){
        System.out.println(studentName+" is studying " +schoolName);
    }
    public void takingBreaks(){
        System.out.println(studentName+" is taking break from " +schoolName);
    }


    public static void main(String[] args) {
    Student student=new Student();
    student.studentName="Radu";
    student.Age=34;
    student.grade=100;
    student.has_ITBackround=false;
    student.attendClass();
    student.studying();
    student.takingBreaks();
        System.out.println(student);

    }
}

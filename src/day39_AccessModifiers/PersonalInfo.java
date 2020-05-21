package day39_AccessModifiers;

public class PersonalInfo {
//only one copy
    //public
    public static String name="Zuura";
    public static char gender='F';
    //default
    static int age=18;
    static char grade='A';
//  private
    private static long SSN=901234;
    private static long  ID=987655;


    public static void main(String[] args) {
        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Name: "+PersonalInfo.SSN); //private
        System.out.println("Name: "+PersonalInfo.grade);//private



    }

}

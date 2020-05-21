package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {

        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.defaultAccess);//this is 100
        System.out.println(obj.publicAccess);//200
// private access  System.out.println(obj.SSN);//private only, error
    }
}

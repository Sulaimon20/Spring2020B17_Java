package day39_AccessModifiers;

public class AccessModifiers {
    //this is default variable
    int defaultAccess=100;

    public int publicAccess=200;

    private long SSN=1234567;

    public AccessModifiers(){
        int SSN=100;
    }

    public static void main(String[] args) {
        AccessModifiers a=new AccessModifiers();
        System.out.println(a.SSN);

        //System.out.println("Age: "+ PersonalInfo.Age);

    }


}

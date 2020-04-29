package day13_StringClass;

public class ignoreCase {
    public static void main(String[] args) {
        String gmail="cybertekschool@gmail.com";
        String userinputGmail="CybertekSchool@gmail.com";
        boolean result = gmail.equalsIgnoreCase(userinputGmail);//true
    if (result){
        System.out.println("Logged in");
    }else {
        System.out.println("Invalid");
    }
    }
}

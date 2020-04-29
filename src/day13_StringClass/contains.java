package day13_StringClass;

public class contains {
    public static void main(String[] args) {
        String s1="CyberTekSchool";
        boolean r1=s1.contains("school"); // true
        System.out.println(r1);

        String password="mmasd1235";
        if (password.contains(" ")){
            System.out.println("Pasword cannot have a space in it");
        }else {
            System.out.println("valid password");
        }
    }
}

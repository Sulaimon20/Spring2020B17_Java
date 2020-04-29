package day13_StringClass;

public class startsWith_endsWith {
    public static void main(String[] args) {
        String str="";
        String webAddress="www.amazon.com";
        if(webAddress.startsWith("www.")){
            System.out.println("valid");
        }if (webAddress.contains("www.")) {
            System.out.println("true");
        }

        String str2="Cybertek School";
        System.out.println(str2.endsWith("l"));

        String email="CybertekSchool@yahoo.com";
        if (email.endsWith("@gmail.com")){
            System.out.println("valid Gmail");
        }else{
            System.out.println("invalid gmail");
        }

        System.out.println("");
    }
}

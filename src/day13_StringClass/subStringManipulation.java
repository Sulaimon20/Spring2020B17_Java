package day13_StringClass;

public class subStringManipulation {

    public static void main(String[] args) {
        String str="Cybertek Scholl is the best";
        String schollName=str.substring(0,27);
        System.out.println(schollName);
        String fullName="Kuzzat Altay";


        String firstname=fullName.substring(0,5+1);
        String lastName=fullName.substring(7,11+1);
        System.out.println(fullName+"\n"+firstname+"\n"+lastName);

        String name="Sulaimon Shokhzoda";
        //           0123456789........18
        String firstName2=name.substring(0,8);
        String lastName2=name.substring(9, 17+1);
        System.out.println(firstName2+lastName2+"@gmail.com");






    }
}

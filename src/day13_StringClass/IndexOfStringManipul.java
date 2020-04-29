package day13_StringClass;

public class IndexOfStringManipul {
    public static void main(String[] args) {
        String str="I like Java programming";
        int num1=str.indexOf("J");
        System.out.println(num1);//7

        String name1="Sulaimon";
        //int name2=num1.indexOf("Good Guy");
        System.out.println(name1+" is ");//

        String fullName="Kuzzat Altay";

        String firstName=fullName.substring(0, fullName.indexOf("") );
        String lastName=fullName.substring(fullName.indexOf("")+1);
        System.out.println(firstName);// uzzat Altay
        System.out.println(lastName);

    }
}

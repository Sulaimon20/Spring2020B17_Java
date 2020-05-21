package day39_AccessModifiers;

public class CheckInfo {
 Integer a=4;
 String txt="String";

 public static void main(String[] args) {


        //               public

        System.out.println("Name: "+PersonalInfo.name);

        //              private

        //System.out.println("Name: "+PersonalInfo.SSN);



        //              default

        System.out.println("Name: "+PersonalInfo.grade);//




        PersonalInfo zuura=new PersonalInfo();
        System.out.println(zuura);
        // System.out.println("Age: "+ PersonalInfo.Age);
    }
}

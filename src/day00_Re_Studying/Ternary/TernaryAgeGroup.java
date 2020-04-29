package day00_Re_Studying.Ternary;

public class TernaryAgeGroup {
    public static void main(String[] args) {


        int age2 = 56;
        String ageGroup2 = "";
        if(age2< 150&&age2 >0){

            if (age2 < 21) {
                ageGroup2="Teenager";
            } else if (age2<55) {
                ageGroup2 = "Adult";
            }else{
                ageGroup2="Senior";
            }
        }else{
            ageGroup2 = "Invalid Entry";
        }
        System.out.println(ageGroup2);
        System.out.println("====================================================");




        int age3=45;
        String ageGroup3=" ";
        if (age3<150&&age3>0){
            ageGroup3=(age3<21)? "Teenager" : (age3<55) ? "Agult" :"Senior";
        }else {
            ageGroup3="Invalid";
        }

        System.out.println(ageGroup3);




    }
}

/*
 write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150

 */
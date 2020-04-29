package day00_ReplIt;

import java.util.Scanner;

public class _078_Car_Insurance_Quote {

    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;

        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name=scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String licence=scan.next();
        if(licence.equalsIgnoreCase("No")){
            System.out.println("Invalid data!");
            System.exit(0);}
        System.out.println("Enter your zip code");
        int zip=scan.nextInt();
        if(zip==20910 || zip==20740){
            premium+=60;
        }else if(zip==22102 ||zip==22103){
            premium+=30;
        }else{
            premium+=50;}
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
         vehicleOwnership=scan.next();
        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium=premium+10;
        }else{
            premium=premium+20;}
        System.out.println("How is this vehicle primarily used?");
         vehicleUsage=scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;
        }else if(vehicleUsage.equals("Pleasure")){
            premium+=10;
        }else if(vehicleUsage.equalsIgnoreCase("Commute")){
            premium+=20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            premium=premium+(daysDrivenToWorkOrSchool*5);
            System.out.println("Miles Driven To Work And/Or School");
             milesToWorkOrSchool=scan.nextInt();
            premium=premium+(milesToWorkOrSchool*1);}
        System.out.println("How old are you?");
        int age=scan.nextInt();
        if(age>=25) {
            premium =premium*1;
        }else if(age<16) {
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age >= 16 || age < 18) {
            premium*= 20;
        } else if (age >= 18 || age <= 21) {
            premium*= 6;
        } else if (age > 21 || age < 25) {
            premium*= 2; }
        System.out.println("How many years you've been driving?");
        int year=scan.nextInt();
        if(year>0 && age>=16){
            premium=premium-(year*5);
        }else{
            System.out.println("Invalid data!");}
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident=scan.next();
        if(accident.equalsIgnoreCase("Yes")){
            System.out.println("How many?");
             accidentsAmount=scan.nextInt();
            premium=premium+premium*20/100*accidentsAmount;}
        System.out.println("Have you had continuous insurance for the past 12 months?");
         continuousInsurance=scan.next();
        if(continuousInsurance.equalsIgnoreCase("No")){
            premium=premium*2;}
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
         education=scan.nextLine();
        if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")){
            premium=premium-premium*5/100;
        }else if(education.equalsIgnoreCase("Doctors")){
            premium=premium-premium*10/100;
        }else if(education.equalsIgnoreCase("Less than High School")){
            premium=premium+(premium*5/100);
        }
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        int name2=name.length()-1;
        referenceNumber=""+name.substring(0,2)+age+name.substring(name2-1,name2+1)+zip
                +education.replace(" ","");
        System.out.println("Reference number: "+referenceNumber.toUpperCase());






        }
       }


/*



        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String license = scan.next();
        if (license.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);}


            System.out.println("Enter your zip code");
            int zip = scan.nextInt();
            if (zip == 20910 || zip == 20740) {
                premium += 60;
            } else if (zip == 22102 || zip == 22103) {
                premium += 30;
            } else {
                premium += 50;
            }

            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();
            if (vehicleOwnership.equalsIgnoreCase("owned")) {
                premium += 10;
            } else {
                premium += 20;}

            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();
            if (vehicleOwnership.equalsIgnoreCase("Business")) {
                premium += 50;
            } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
                premium += 10;
            }else if(vehicleUsage.equals("Commute")){
                premium+=20;
                System.out.println("Days Driven To Work And/Or School");
                 daysDrivenToWorkOrSchool=scan.nextInt();
                premium+=(daysDrivenToWorkOrSchool*5);
                System.out.println("Miles Driven To Work And/Or School");
                 milesToWorkOrSchool=scan.nextInt();
                premium+=(milesToWorkOrSchool*1);}

            System.out.println("How old are you?");
            int age = scan.nextInt();
            if (age < 16) {
                System.out.println("Invalid data!");
                System.exit(0);
            } else if (age >=16 && age < 18) {
                premium *= 20;
            } else if (age >= 18 && age <= 21) {
                premium *= 6;
            } else if (age > 21 && age < 25) {
                premium *= 2;
            }

            System.out.println("How many years you've been driving?");
            int experience = scan.nextInt();
            if(experience>0 && age>=16){
                premium-=(experience*5);
            }else{
                System.out.println("Invalid data!");}

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident=scan.next();
        if(accident.equals("Yes")){
            System.out.println("How many?");
            double year=scan.nextDouble();
            premium+=(premium*20)/(100*year);}
        System.out.println("Have you had continuous insurance for the past 12 months?");
        String insurance=scan.next();
        if(insurance.equals("No")){
            premium=premium*2;}

            scan.nextLine();

            System.out.println("What is the highest level of education you have completed?");
            education = scan.nextLine();
            if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachalors")
                    || education.equalsIgnoreCase("Masters")) {
                premium -= (premium * 5) / 100;
            }
            if (education.equalsIgnoreCase("Doctors")) {
                premium -= (premium * 10) / 100;
            }
            if (education.equalsIgnoreCase("Less than high school")) {
                premium += (premium * 5) / 100;
            }


            System.out.println(name + ", here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);

        int name2=name.length()-1;
        referenceNumber=""+name.substring(0,2)+age+name.substring(name2-1,name2+1)+zip
                +education.replace(" ","");
        System.out.println("Reference number: "+referenceNumber.toUpperCase());




Display message: How many years you've been driving?
input from user: 5
Display message: Have you had any accidents in the last 5 years?
input from user: No
Display message: Have you had continuous insurance for the past 12 months?
input from user: Yes
Display message: What is the highest level of education you have completed?
input from user: PhD
Display message: David, here's your quote!
Display message: Start Your Policy Today For: $52.25
Display message: Reference number: DA25ID20910PHD
 */
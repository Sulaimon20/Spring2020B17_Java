package day00_ReplIt;

import java.util.Scanner;

public class _047_Real_Estate_Calculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

//                          type of house
        System.out.println("Enter your property type:");//Boolean, Condo=50000,Townhouse=75000, Single=95000
        houseType=scan.nextLine();
        if (houseType.equalsIgnoreCase("Condo")) {
            propertyPrice += 50000;
        }else if (houseType.equalsIgnoreCase("Townhouse")){
            propertyPrice+=75000;
        }else if (houseType.equalsIgnoreCase("Single Family home")){
            propertyPrice+=95000;}
        //              quantity of room
        System.out.println("How many bedrooms do you have?");// int
        numberOfBedrooms=scan.nextInt();
        if (numberOfBedrooms>=1){
            propertyPrice+=(numberOfBedrooms*30000);
        }

//              backyard
        System.out.println("Do you have a backyard?");
        backyard=scan.nextBoolean();
        if (backyard==true){
            if (houseType.equalsIgnoreCase("Condo")){
                propertyPrice+=0;
                System.out.println("Backyard is not available for condo!");
            }else {
                propertyPrice+=5000;
            }
        }
        //         Garage
        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();
        if (garage==true){
            System.out.println("How many spots?");
            garageSpots=scan.nextInt();
            if (garageSpots<=10){
                propertyPrice+=garageSpots*20000;
            }else {
                System.out.println("Pardon, it's not a public parking!");
            }
        }
        //      metro
        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextFloat();
        if (metroAccessibility<=1){
            propertyPrice+=10000;
        }else if (metroAccessibility>1&&metroAccessibility<=3){
            propertyPrice+=5000;
        } else{
            propertyPrice+=0;
        }
//              highway
        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        if (highwayAccessibility <= 1){
            propertyPrice +=15000;
        }else if (highwayAccessibility >= 1 && highwayAccessibility <= 5){
            propertyPrice += 8000;
        }else if (highwayAccessibility > 5 && highwayAccessibility <= 20){
            propertyPrice +=4000;
        }else{
            propertyPrice+=0;
        }
//                  school score
        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextInt();
        if (schoolScore>=8&&schoolScore<=10){
            propertyPrice+=45000;
        }else if (schoolScore<8&&schoolScore>=4){
            propertyPrice+=20000;
        }else {
            propertyPrice+=5000;
        }
        System.out.println("Does any of your family members smoking?");
        smoking=scan.nextBoolean();
        if (smoking==true){
            propertyPrice-=5000;
        }else
            propertyPrice+=0;
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");


    }
}
/*
System.out.println("Enter your property type: Condo")
System.out.println("How many bedrooms do you have? 3")
System.out.println("Do you have a backyard? true")
System.out.println("Backyard is not available for condo! true")
System.out.println("Do you have garage? true")
System.out.println("How many spots? 2")
System.out.println("How close is metro station? 0.5")
System.out.println("How close is highway? 1.5")
System.out.println("What's the rating of nearest school? 9"
System.out.println("Does any of your family members smoking? true")
 */
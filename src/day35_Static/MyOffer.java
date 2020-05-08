package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setInfo("DC", "Cybertek", 200_000, false);

        Offer offer2=new Offer();
        offer2.setInfo("VA", "BOA", 117_000, false);

        Offer offer3=new Offer();
        offer3.setInfo("VA", "Chase", 150_000, true);

        Offer offer4=new Offer();
        offer4.setInfo("KY", "Google", 115_000, false);

        String myLocation="VA";
        Offer [] offers={offer1,offer2,offer3,offer4};

        ArrayList<Offer>Accept=new ArrayList<>(Arrays.asList(offers));
        Accept.removeIf(p -> p.salary<100_000 || p.isFullTime==false||p.location.equals(myLocation));// we removed coz more than 100K and fulltime job

        for (Offer eachOffer: Accept){
            System.out.println(eachOffer);

        }



        System.out.println(Accept.size());



    }
}
/*
create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K
 */
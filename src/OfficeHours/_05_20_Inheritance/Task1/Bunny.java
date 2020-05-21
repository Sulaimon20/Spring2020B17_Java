package OfficeHours._05_20_Inheritance.Task1;

public class Bunny extends Pet{
/*
	Bunny:
		variables:	name, age, color, size, breed, isPet, numberOfeyes
		methods: eat, sleep, drink, toString, Dig, setInfo
		not inherited:
		    Dig
 */

    public Bunny(String name, int age, String color, String size, String breed) {
        setInfo(name, age, color, size, breed);
    }



    public void dig(){
        System.out.println(name+" digging");
    }



}

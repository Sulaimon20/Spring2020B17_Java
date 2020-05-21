package day00_ReplIt.Methods.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Person s=new Person("Sas","as",2,3,1999,"343445");

        System.out.println(s);
    }
}
/*
Rename file1.java to Person.java

Create the a Person class with the following:

instance Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

Create a public method called verifySSN that takes in a String parameter and returns a boolean.  It will check the parameter against the person's SSN and return true or false based on whether they match.

Complete the questions on Classroom.
 */

package day40_Encapsulation.Task2_Person;

public class Person {
//instance variables
    public String name;
    private long SSN;
    private int ID;
//  default Constructor
    public Person(String name){
        this.name = name;
    }
//  method to get the "private" var => SSN
    public long getSSN(){
        return SSN;
    }
//  method to input the private var => SSN
    public void setSSN(long SSN){
        this.SSN = SSN;
    }
//  method to get(read) the private var => ID
    public int getID(){
        return ID;
    }
//  method to write the private var =>ID

    public void setID(int ID){
        this.ID = ID;
    }
//  method to write the private var-s =>SSN and ID
    public void setSSNAndID(long SSN, int ID){
        this.SSN = SSN;
        this.ID = ID;
    }

    public static void main(String[] args) {
        Person person1=new Person("Sulaimon");
        person1.setID(123);
        person1.setSSN(12245346);
        person1.getID();
        person1.getSSN();
        System.out.println("Sula SSN: "+person1.getSSN());
    }



}

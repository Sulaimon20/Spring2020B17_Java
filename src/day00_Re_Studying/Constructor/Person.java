package day00_Re_Studying.Constructor;
import java.time.LocalDate;
import java.time.Month;

public class Person {
    String name;
    String address;
    int dataOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    int age;

    public Person(String name, String address,int dataOfBirth,int monthOfBirth,int yearOfBirth) {
        this.name = name;
        this.address=address;
        this.dataOfBirth=dataOfBirth;
        this.monthOfBirth=monthOfBirth;
        this.yearOfBirth=yearOfBirth;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Name:" + name +
                "\naddress: " + address +
                "\nDate of birth: " + dataOfBirth +
                "\nMonth of birth: " + monthOfBirth +
                "\nYear of birth: " + yearOfBirth +
                "\nage: " + age;
    }

    public static void main(String[] args) {
        Person person1=new Person("Radu","234 Rain st., Lurey, MD",19,11,1991);

        LocalDate today=LocalDate.now();
        int age=today.getYear()-person1.yearOfBirth;
        Month month1= today.getMonth();
         today.getDayOfMonth();

        if (month1.getValue()<=person1.monthOfBirth){
            person1.age=age-1;
            if(today.getDayOfMonth()<person1.dataOfBirth){
            person1.age=age-1;
            }
        }
        System.out.println(person1);

    }

}



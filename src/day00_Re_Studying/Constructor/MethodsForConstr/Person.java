package day00_Re_Studying.Constructor.MethodsForConstr;

class Person {
    public String name;
    public int age;
    private int SSN;

    public Person(String name, int age, int SSN){
    this.name=name;
    this.age=age;
    this.SSN=SSN;
    }

    public void sleeping(){
        System.out.println(name+ " is sleeping");
    }
    public String eating(int foodNumber, String food){
        //this.food=food;
        return name+ " is eating "+foodNumber+" "+food;
    }



    public String toString() {
        return  "name='" + name  +
                ", age=" + age +
                ", SSN=" + SSN ;
    }

    public static void main(String[] args) {

       Person person1=new Person("Oleg",24,124556);

        System.out.println(person1);
        person1.sleeping();
        System.out.println(person1.eating(3,"apple" ));


    }



}

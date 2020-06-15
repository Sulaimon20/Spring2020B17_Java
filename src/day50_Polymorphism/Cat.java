package day50_Polymorphism;

public final class Cat extends Animal{//3 var, 3 methods
    public String catName;

    public Cat(String catName, String gender, int age){
        this.catName=catName;
        this.gender=gender;
        this.age=age;
    }
    public void eat(){
        System.out.println(catName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println(catName+" is sleeping");
    }
    public void     scratch(){
        System.out.println(catName+" is scratching");
    }


}

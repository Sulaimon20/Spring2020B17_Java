package OfficeHours._06_10_Abstract;

interface Edible {
    void eat();
}
interface Drinkable extends Edible{
    abstract void drink();
}

class Burger implements Edible {
    String name;
    String size;

    public Burger(){
        this.name = name;
        this.size = size;
    }

    public void eat(String food) {
        System.out.println("Eating "+size+" "+name);
    }

    public String toString() {
        return name + size;
    }

    public void eat() {

    }
}

class IceCoffee implements Drinkable {

    String size;
    public IceCoffee(){
        this.size = size;

    }
    public void drink() {
        System.out.println("Drinking "+size);
    }

    public String toString() {
        return  size;
    }
    @Override
    public void eat() {

    }

    public static void main(String[] args) {
        Burger obj=new Burger();
        obj.name="Burger";
        obj.size="Big";
        obj.eat();
        IceCoffee obj2=new IceCoffee();

        obj2.drink();

        String a=new String();
    }

}



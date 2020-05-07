package day00_ReplIt.Custom_Methods;

public class Atts {
    String name;
    String color;
    int amount;

   public String asString (String name, String color, int amount){
       this.name=name;
       this.color=color;
       this.amount=amount;
        return "name: "+name+" color: "+color+" amount: "+amount;
    }

}

package day34_Custom_Class.PizzaStore;

public class PizzaCustom {
    String size;
    int cheeseTopping;
    int pepperTopping;

    public void customizeOrder(String sizing, int cheese, int pepperoni){
        size=sizing;
        cheeseTopping=cheese;
        pepperTopping=pepperoni;
    }
    public Double calcCost(){
        double cost;
        if (size.equalsIgnoreCase("Small")){
            cost=10+1.5*pepperTopping+1*cheeseTopping;
        } else if (size.equalsIgnoreCase("Middle")){
            cost=12+1.5*pepperTopping+1*cheeseTopping;
        }else{
            cost=14+1.5*pepperTopping+1*cheeseTopping;
        }
        return cost;
    }
    public String toString(){
        return "Pizza size : "+size+"\nCheese: "+cheeseTopping
          +"\nPeperoni: "+pepperTopping+"\nPizza cost: $"
          +calcCost();
    }
}

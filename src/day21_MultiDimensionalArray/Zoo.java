package day21_MultiDimensionalArray;

public class Zoo {
    public static void main(String[] args) {
        String [] wildAnimals={"Tiger", "Lion", "Monkey", "Turtle", "Corcodile"};
        String [] birds={"Eagle", "Duck", "Peacock", "Chicken"};

        String zoo[][]={wildAnimals,birds};
        String ch=zoo [1][3]; // if you want to pick chicken
        System.out.println(ch);// chicken
        for (String eachBird: zoo[1]){
            if (eachBird.equals("Chicken")){// except chicken
                continue;
            } System.out.println(eachBird);
            }
        System.out.println("=======================");
        for (String eachZoo: zoo[0]){
            if (eachZoo.equals("Turtle")){
                continue;
            }
            System.out.println(eachZoo);// print all excet turtle
        }
    }
}

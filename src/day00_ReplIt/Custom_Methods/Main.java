package day00_ReplIt.Custom_Methods;

public class Main {
    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString(a.name, a.color, a.amount ));
    }
}

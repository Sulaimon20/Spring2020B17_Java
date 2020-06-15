package day46_final_abstract.Final;

public class final_Variables {
    //final instance var
    final int instanceVariable=300;
    //final instance variables compare to local variables  need to be initialized right away
    final int instanceVariable2=400;

   public static void main(String[] args) {
        // final ==> constant, cannot be reassigned
        //you cannot change it
        final double PI=3.14;

        final String gender="Male";

        final int score;

        score=100;
        int x=130;
        final_Variables obj=new final_Variables();
        //obj.instanceVariable  <=== you cannot initialize it




    }
}

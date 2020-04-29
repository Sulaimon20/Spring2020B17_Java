package day21_MultiDimensionalArray;

public class arrayString {
    public static void main(String[] args) {
        String [] titles ={"William", "Beatrice", "Lucy", "Sam"};
        for( String name : titles ) {
            System.out.print( name );
            System.out.print(",");//William,Beatrice,Lucy,Sam,
        }
        System.out.println("\n =======================");
        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
        //The conventional approach of using the for loop
        System.out.println("Using conventional For Loop:");
        for(int i=0; i< arrData.length; i++){
            System.out.println(arrData[i]);
        }
        System.out.println("\nUsing Foreach loop:");
        //The optimized method of using the for loop - also called the foreach loop
        for (String each : arrData){
            System.out.println(each);
        }


    }
}

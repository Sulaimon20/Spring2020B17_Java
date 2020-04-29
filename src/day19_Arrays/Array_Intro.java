package day19_Arrays;

public class Array_Intro {
    public static void main(String[] args) {
 ///       int scores=90,10,20; regular variables contains just one
        int [] scores={70, 75, 85, 90, 95, 100};
        //      index   0   1   2   3   4   5
        int num1=scores[2];
        System.out.println(num1);//85
        int num2=scores[5];
        System.out.println(num2);//100
        String [] friends={"Mike", "Adam", "Anna", "Tim", "Iman", "Firuz"};
        //        index=  0        1       2      3          4      5
        // 1 way
        String name1=friends[2];
        System.out.println(name1);
        // 2 way
        System.out.println(friends[2]);



    }
}

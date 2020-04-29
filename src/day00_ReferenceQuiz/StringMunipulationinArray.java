package day00_ReferenceQuiz;

import java.util.Arrays;

public class StringMunipulationinArray {
    public static void main(String[] args) {
        String [] [] sen={{"Java is difficult"}, {"Java is good"}};
                //                  0                   1
        System.out.println(Arrays.deepToString(sen));//[[Java is difficult], [Java is good]]
        System.out.println(Arrays.deepToString(sen[0]));//[Java is difficult]
        System.out.println(Arrays.toString(sen[0]));//[Java is difficult]
        System.out.println(Arrays.deepToString(sen[0]).equals(sen[1]));//false






    }
}

package day00_ReplIt.Methods;

public class NOT_DONE_AssessmentTest2_4AppearsTwice {
    public static void main(String[] args) {
        System.out.println();
    }


    public static boolean appearsTwice(String target, String sentence) {
     if (sentence.contains(target)==sentence.contains(target+target)) {
     }
        return false;
    }
}
/*
Main.appearsTwice("java", "java is fun!") - returns false, because java appears
only once. Main.appearsTwice("laptop", "I would like to buy a new laptop,
because my laptop is too old.") - returns true, because laptop appears twice.
 */
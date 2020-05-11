package day00_ReplIt.Methods;

public class AssessmentTest2_4AppearsTwice {
    public static void main(String[] args) {
        String target = "java";
        String sentence = "java is fun!, java";
        System.out.println(appearsTwice(target, sentence));
    }

    public static boolean appearsTwice(String target, String sentence) {

        int count = 0;
        while (sentence.contains(target)) {
            sentence = sentence.replaceFirst(target, "");
            count++;
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
/*
Main.appearsTwice("java", "java is fun!") - returns false, because java appears
only once. Main.appearsTwice("laptop", "I would like to buy a new laptop,
because my laptop is too old.") - returns true, because laptop appears twice.
 */
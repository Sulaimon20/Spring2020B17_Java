package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _097_EqualsJavaPythonLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int java=0;
        int python=0;

        boolean exists = false;

        if (sentence.contains("java") && sentence.contains("python")&& java==python
                && !sentence.contains("javas")) {
            exists = true;
        }
        System.out.println(exists);

    }
}

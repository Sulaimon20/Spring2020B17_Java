package day22_Arras_Loops;

public class Java_Python {
    public static void main(String[] args) {
//write a program that can return the number of appearances of "java" and "python" anywhere
// in the sentence
//(it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)

        String sen= "I like java and javascript, python python";
        int countJava=0;// we have java 2 times
        int countPython=0;
        String [] words=sen.split(" ");// [I, like, java, and, javascript]

        for (String each: words){
            if (each.contains("java")){// we look for
                countJava++;
            }
            if (each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);//2
        System.out.println(countPython);//2
        System.out.println(countJava==countPython);//true

    }
}
/*
int countjava=1;
    int countpython=1;
        while(sentence.contains("java")||sentence.contains("python")) {
            if (sentence.contains("java")) {
                sentence=sentence.replaceFirst("java", "");
            }
            if (sentence.contains("python")) {
               sentence= sentence.replaceFirst("python", "");
                countpython++;
            }
             }  if(countjava==countpython){
                System.out.println("true");
             }else{
                System.out.println("false");
        }

 */
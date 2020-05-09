package day00_ReplIt.quizArray;

public class replaceMethod {
    public static void main(String[] args) {


        String str = "java cv java pro";
      //  System.out.println(str.replaceFirst("java", "C#"));
    int count=0;
        while(str.contains("java")){
            count++;
            str=str.replaceFirst("java","");
            System.out.println(str);
        }
        System.out.println(count);

        for (int i=0; i<str.length()-1;i++) {
            String word = str.substring(i, i + 2);
            if (word.equals("hi")){ count++;}
            }


    }
}

package day00_ReferenceQuiz;
//ANSWER C  true is printed out exactly three times. =============> Answer
public class _2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
/*
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.toCharArray()[i];
        }
        System.out.println(reverse);
        // palindrome or not
    if (str.equals(reverse)){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    //anagram or not
        String str1="Listen";
        String str2="Silent";

        String w=str1.toLowerCase();
        String w2=str2.toLowerCase();

        char [] s=w.toCharArray();
        char [] s2=w2.toCharArray();

        Arrays.sort(s);
        Arrays.sort(s2);
       System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s2));
*/



    }


}
/*
What is the result of the following code?
 A. true is printed out exactly once.
 B. true is printed out exactly twice.
 C. true is printed out exactly three times. =============> Answer
 D. true is printed out exactly four times.
 E. The code does not compile.

 */
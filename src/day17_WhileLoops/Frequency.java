package day17_WhileLoops;

class Frequency {
    public static void main(String[] args) {

        String str="we found an error in this string aaa";// we can use ABC, ****, ##### whatever
        int count=0; // 2, how many Java do I have in the sentence

        while (str.contains("a")){
            count++;
            str=str.replaceFirst("a", "");
        }
        System.out.println(count);
        String str1="asasas erter as rgbght";
        int count1 =0;
        for (int i=0; i<str1.length();i++){
            if (str1.contains("a")){
                str1=str1.replaceFirst("a","");
                count1++;
            }
        }
        System.out.println(count1);




    }
}

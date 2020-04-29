package day17_WhileLoops;

class Frequency {
    public static void main(String[] args) {

        String str="1111111111111111";// we can use ABC, ****, ##### whatever
        int count=0; // 2, how many Java do I have in the sentence

        while (str.contains("1")){
            count++;
            str=str.replaceFirst("1", "");
        }
        System.out.println(count);




    }
}

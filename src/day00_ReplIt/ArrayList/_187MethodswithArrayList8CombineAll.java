package day00_ReplIt.ArrayList;

import java.util.ArrayList;

public class _187MethodswithArrayList8CombineAll {

    static public ArrayList combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> words =new ArrayList<>();
        words.addAll(wordList1);
        words.addAll(wordList2);
        return words;
    }

    public static void main(String[] args) {
        ArrayList<String> wordList1 =new ArrayList<>();
        wordList1.add("1");
        wordList1.add("2");
        wordList1.add("3");
        wordList1.add("4");
        System.out.println(wordList1);
        ArrayList<String> wordList2 =new ArrayList<>();
        wordList1.add("3");
        wordList1.add("4");
        System.out.println(combineAL(wordList1,wordList2));
    }
}

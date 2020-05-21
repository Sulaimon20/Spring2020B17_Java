package day00_ReplIt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodswithArrayList_removeAll {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        String targetWord="hi";

        //<String> wordList1 = new ArrayList<String>(wordList);
        //wordList1.removeAll(Arrays.asList(targetWord));
        //System.out.println(removeAll(wordList,targetWord));

    }

    public static void removeAll(ArrayList<String> wordList, String targetWord){

        ArrayList<String> wordList1 = new ArrayList<>(wordList);
        wordList.removeAll(Arrays.asList(targetWord));
        System.out.println(wordList);;
    }

}

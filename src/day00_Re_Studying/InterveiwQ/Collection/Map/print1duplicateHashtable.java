package day00_Re_Studying.InterveiwQ.Collection.Map;

import java.util.Hashtable;

public class print1duplicateHashtable {
/*
Super popular interview question. Find the first non repeated character in a string. For example “a green apple” should return ‘g’.
Hint: Use hash tables with characters as the key and number of occurrence as the value. You can use Java HashMap<> interface.
 */
    public static void main(String[] args) {

        String str="a green apple";
        findUsingForLoop(str);


    }


    public static void findUsingForLoop(String str){
        char[] chrArr = str.toCharArray();
        Hashtable<Character, Integer> myTable2 = new Hashtable<>();
        System.out.println("From string =[ "+str+" ]");
        for(char c: chrArr){
            if(myTable2.containsKey(c)){
                //                count=myTable2.get(c)+1;
                myTable2.put(c, myTable2.get(c)+1);
            }else{
                myTable2.put(c, 0);
            }
        }
        for(char c: chrArr){
            if(myTable2.get(c)==0){
                System.out.println("First non repeated character = "+c);
                break;
            }
        }
    }

}

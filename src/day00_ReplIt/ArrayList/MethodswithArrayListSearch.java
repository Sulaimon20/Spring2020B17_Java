package day00_ReplIt.ArrayList;
import java.util.ArrayList;
public class MethodswithArrayListSearch {

    public static String search(ArrayList<String> r, String find)
    {
        for(int i=0; i<r.size();i++){
            if(r.get(i).contains(find))
                return r.get(i);
        }
        return "search failed";


    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar

        //my code

    }//end main


}

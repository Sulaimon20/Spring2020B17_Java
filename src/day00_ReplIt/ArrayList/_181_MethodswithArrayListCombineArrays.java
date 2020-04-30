package day00_ReplIt.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class _181_MethodswithArrayListCombineArrays {


    public static String combineRs(String[] r1,String[] r2) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < r1.length; i++) {
            result.add(r1[i]);
        }
        for (int i = 0; i < r1.length; i++) {
            result.add(r2[i]);
        }
        String result2 = "";
        for (int i=0; i<result.size();i++){
            result2+=(result.get(i));
        }
        String result3=result2.replace("b", " b");

        return result3;
    }

    public static void main(String[] args) {
    String [] r1={"f","o","o"};
    String [] r2={"b","a","r"};
        //combineRs(r1,r2);
    }
}
/*
combine two String arrays into one arraylist and return it as a string.
for example:
combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"
combineRs(["1","2","3"],[" 4"])
returns "1234"
 */
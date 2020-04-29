package day16_ForLoop;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="ACCDD";
        //      i=  0123
        String result="";//expected result to be stored in to this variable

        for (int i=0; i<=str.length()-1; i++) { // 0,1,2,3
            if(result.contains(""+str.charAt(i) )) {
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);
    }

}

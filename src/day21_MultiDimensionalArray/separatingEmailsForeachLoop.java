package day21_MultiDimensionalArray;

public class separatingEmailsForeachLoop {
    public static void main(String[] args) {

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
//        THE first method
        for(String eachEmail:emails){
            if (!eachEmail.endsWith("@gmail.com")){//the "@gmail.com" will be excluded
            System.out.println(eachEmail);
        } }
// THE SECOND method
        for (String eachEmail : emails){// DON'T USE CONTAINS METHODS
            if (eachEmail.endsWith("gmail.com")){
                continue;
            }
            System.out.println(eachEmail);
        }



    }
}

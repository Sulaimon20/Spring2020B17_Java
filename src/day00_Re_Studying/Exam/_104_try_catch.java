package day00_Re_Studying.Exam;

import java.util.ArrayList;

public class _104_try_catch {
    public static void main(String[] args) {
        ArrayList myList=new ArrayList();
        String [] myArray;
        try{
            while (true){
                myList.add("myString");
            }
        }catch (RuntimeException e){
            System.out.println("Caught a RuntimeException");
        }catch (Exception e){
            System.out.println("Caught a Exception");
        }
        System.out.println("Ready to use");
    }
}

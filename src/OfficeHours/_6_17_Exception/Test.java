package OfficeHours._6_17_Exception;

public class Test {

    public static void main(String[] args) {

        try{
            String s="abc";
            System.out.println(s.charAt(30));

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }catch (Exception e){
            System.out.println("general exception");

        }


    }

}

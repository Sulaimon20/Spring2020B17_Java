package OfficeHours._6_17_Exception;

public class Test2 {
    // difference btw  &    &&
    // difference btw  |    ||
    public static void main(String[] args) {

        System.out.println(false&true);// this is false
        System.out.println(false&&true);//this is false as well

        int one =0;
        System.out.println(one++>0 & ++one >0);

        System.out.println(one++>0 && ++one >0);
        System.out.println(one==2);


    }


}

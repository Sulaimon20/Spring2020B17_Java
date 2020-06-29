package day54_Maps;

import day00_Re_Studying.Strings.String;

public class String_VS_Buffer_VS_Builder {
    //String is immutible ==>once create a String, you cannot
    //modifier its value
    public static void main(String[] args) {


        //String str = "Cybertek";
        // str.concat("School");
        //System.out.println(str);//Cybertek

        StringBuilder str1 = new StringBuilder("Cybertek");
        StringBuilder str2 = new StringBuilder("School");
        str2 = str1;
        System.out.println(str1);//Cybertek
        System.out.println(str2);//Cybertek
        System.out.println(str1 + " " + str2);//Cybertek Cybertek
        str1.append("School");
        System.out.println(str1);//CybertekSchool

        System.out.println("===============================");

        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append("School");
        System.out.println(buffer);



    }
}

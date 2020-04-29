package day00_Re_Studying;

import java.text.NumberFormat;

public class convertingToPercent {
    public static void main(String[] args) {

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result =percent.format(0.2);
        System.out.println(result);
    }
}

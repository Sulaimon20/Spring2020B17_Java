package day00_ReplIt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class _1TimeConversion {
    public static void main(String[] args) {


        String s = "07:05:45PM";
        String s1[] = s.split(":");
        char c[] = s1[2].toCharArray();
        if (s1[2].contains("PM")) {
            int n = Integer.parseInt(s1[0]);
            n = n + 12;
            System.out.println(n + ":" + s1[1] + ":" + c[0] + c[1]);
        } else {
            System.out.println(s1[0] + ":" + s1[1] + ":" + c[0] + c[1]);
        }
    }
}

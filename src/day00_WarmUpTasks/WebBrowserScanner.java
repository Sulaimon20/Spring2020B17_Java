package day00_WarmUpTasks;

import java.util.Scanner;

public class WebBrowserScanner {
    public static void main(String[] args) {

        String browserName= "chrome";

        switch (browserName){
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening");
                break;
            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening");
                break;
            case "Safari":
                System.out.println("Safari is opening");
                break;
            case "Opera":
                System.out.println("Opera is opening");
                break;
            default:
                System.out.println("Invalid browser name, please give the right browser name");
        }

    }
}

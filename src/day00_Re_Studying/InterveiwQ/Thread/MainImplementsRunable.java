package day00_Re_Studying.InterveiwQ.Thread;

import java.util.Random;

public class MainImplementsRunable implements Runnable {

    public static void main(String[] args) {
        MainImplementsRunable obj = new MainImplementsRunable();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

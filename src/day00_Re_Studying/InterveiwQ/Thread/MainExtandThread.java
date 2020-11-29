package day00_Re_Studying.InterveiwQ.Thread;

public class MainExtandThread extends Thread {

    public static void main(String[] args) {
        MainExtandThread thread = new MainExtandThread();
        thread.start();
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}

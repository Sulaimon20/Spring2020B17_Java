package day41_Inheritance.Book;
//
public class AudioBook extends Book{

    public String length;

    public void listening(){
        System.out.println(title+" listening");
    }

    public static void main(String[] args) {
        AudioBook a=new AudioBook();

        a.title="Hugo";
        a.listening();
    }
}

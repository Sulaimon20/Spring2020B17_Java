package day41_Inheritance.Book;

public class booksObjects {
    public static void main(String[] args) {
        Ebook book1=new Ebook();
        //System.out.println(book1);
        book1.title="Hamlet";
        book1.price=540;
        book1.author="Shakespeare";
        book1.size="1.5 MB";
        book1.pages=123;
        System.out.println(book1);
        book1.readBook();

        System.out.println("==========================");

        AudioBook book2=new AudioBook();
        book2.title=" \"War and peace\" ";
        book2.author=" Leo Tolstoy ";
        book2.listening();
        book2.length=" 1 hours ";
        book2.price=320;
        System.out.println(book2);
        System.out.println("Length of the audioBook" +book2.title+" is " +book2.length );

    }
}

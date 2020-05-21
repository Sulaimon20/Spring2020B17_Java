package day41_Inheritance.Book;

public class Ebook extends Book{
    public String size;
    public int pages;

    public void readBook(){
        System.out.println("reading"+title);
    }

    public static void main(String[] args) {
        Ebook book1=new Ebook();
        book1.title="The king Lear";
        book1.author="Shakespeare";
        book1.pages=123;
        book1.readBook();




    }


}

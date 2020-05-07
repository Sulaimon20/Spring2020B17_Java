package day34_Custom_Class.BookStore;

public class BookShop {
    String genre;
    String bookName;
    String bookAuthor;
    int publishYear;
    double bookPrice;
    int quantity;

    public void setBookInfo(String genre, String bookName, String bookAuthor, int publishYear, double bookPrice, int quantity){
        this.genre=genre;
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.publishYear=publishYear;
        this.bookPrice=bookPrice;
        this.quantity=quantity;
    }
    public double totalPrice(){
        return quantity*bookPrice; };

    public String toString(){
        return "Book genre: "+genre+"\nThe name of the book: "+bookName+
                "\nThe author: "+bookAuthor+"\nYear of publishing: "+publishYear+
                "\nPrice of the book: "+bookPrice+"\nQuantity: "+quantity+"\nPrice: "+bookPrice+
                "\nTotal price: "+totalPrice();

    }


}

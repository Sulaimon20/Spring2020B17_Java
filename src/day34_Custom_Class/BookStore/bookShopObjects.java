package day34_Custom_Class.BookStore;

import java.util.ArrayList;
import java.util.Arrays;

public class bookShopObjects {
    public static void main(String[] args) {
        BookShop[] books={new BookShop(), new BookShop(), new BookShop(), new BookShop(), new BookShop()};
        books[0].setBookInfo("Non-fiction", "Geography", "Tom Brain", 2002, 110, 2);
        books[1].setBookInfo("Fiction", "From A to Z", "Duglas McCane", 1999, 100, 1);
        books[2].setBookInfo("Non-fiction", "Cold war", "Phillip Sean", 1950, 10, 2);
        books[3].setBookInfo("fiction", "Light in the darkness", "Raad Marshall", 2012, 100, 12);
        books[4].setBookInfo("Non-fiction", "The Ocean", "Jim McBrain", 1989, 60.5, 20);


        ArrayList<BookShop>bookTotalPrice=new ArrayList(Arrays.asList(books));


    }
}

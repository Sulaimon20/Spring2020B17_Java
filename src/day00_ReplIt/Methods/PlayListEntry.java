package day00_ReplIt.Methods;

public class PlayListEntry {
    String title ;
    String artist;
    int playCount =0;



    public void get(String title, String artist, int playCount ){

        this.title=title ;
        this.artist=artist;
        this.playCount =playCount;

    }
    public void set(String title, String artist, int playCount ){

        this.title=title;
        this.artist=artist;
        this.playCount =playCount;

    }

    public static void main(String[] args) {

    }

    /*
    Write the definition of a class PlayListEntry containing:
An instance variable title of type String, initialized to the empty String.
An instance variable artist of type String, initialized to the empty String.
An instance variable playCount of type int, initialized to 0.

In addition, your PlayList class definition should provide an appropriately named "get" method and "set" method for each of these.
No constructor need be defined.
     */


}

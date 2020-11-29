package day52_Collection.List;
import java.util.*;
public class Lists {
    public static void main(String[] args) {
//List is an interface (NOT A CLASS!!!!), that extends Collection. it implemented by these classes:
//        ArrayList - array based class, singly linked
//        LinkedList - each object inside is Doubly linked
//        Vector - array based class, synchronized, only preferred by multi THREAD
// List<Integer> list1 = new List<>(); <= impossible, it is an interface

//It cannot an objects, but can be a reference type for its subclass only

// List (interface, reference type) ==> ArrayList (Class)
    List<Integer> list1 = new ArrayList<>();//it is singly Linked list
    list1.add(1);
        ArrayList<Integer> arraylist =new ArrayList<>();//
        arraylist.add(12);
//List (interface, reference type) ==> LinkedList (Class)
    List<Integer>list2=new LinkedList<>();//it is doubly linked list
    list2.add(2);
    list2.get(0);
    list2.remove(0);
//List (interface, reference type) ==> ArrayList (Class)
    Vector<Integer> vector =new Vector<>();//the difference ==> synchronized
    vector.add(12);

    Stack<Integer> stack=new Stack<>();
    stack.add(12);

        System.out.println("=========================");

    Stack<String> names=new Stack<>();
    names.add("Bony");
    names.add("Alex");
    names.add("Rad");
    names.add("Omar");
    names.add("Chmo");

    System.out.println(names);//[Bony, Alex, Rad, Omar, Chmo]
    String s1=names.pop();//remove the last one which came in ==> last in, first out LIFO
    System.out.println(s1);
    System.out.println(names);//[Bony, Alex, Rad, Omar]
    names.push("Harun");//[Bony, Alex, Rad, Omar, Chmo, Harun]





    }
}

package day52_Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>();
        //first in first out ==> FIFO
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        System.out.println(q);//[A, B, C, D]
        String s=q.poll();
        System.out.println(s);//A
        System.out.println(q);//[B, D, C]
        q.add("E");
    }
}

package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public C01_Deque() {
    }

    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList();
        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        dq1.addFirst("A");
        System.out.println((String)dq1.getFirst());
        System.out.println((String)dq1.getLast());
        System.out.println((String)dq1.remove());
        System.out.println((String)dq1.poll());
        System.out.println((String)dq1.removeLast());
        System.out.println((String)dq1.remove());
        System.out.println((String)dq1.poll());
        dq1.add("K");
        dq1.add("B");
        dq1.push("F");
        System.out.println("pop : " + (String)dq1.pop());
        System.out.println((String)dq1.element());
        System.out.println((String)dq1.peek());
        System.out.println((String)dq1.peekFirst());
        System.out.println((String)dq1.peekLast());
        System.out.println(dq1.offer("C"));
        System.out.println(dq1.offerFirst("M"));
        System.out.println(dq1);
    }
}




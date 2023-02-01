package ders42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public C04_LinkedListQueueDataTuru() {
    }

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList();
        q1.add("H");
        q1.add("Y");
        q1.offer("K");
        System.out.println((String)q1.remove());
        System.out.println(q1.remove("K"));
        q1.remove();
        System.out.println((String)q1.poll());
        q1.add("H");
        q1.add("Y");
        System.out.println("peek : " + (String)q1.peek());
        System.out.println("element : " + (String)q1.element());
        q1.clear();
        System.out.println("peek : " + (String)q1.peek());
    }
}



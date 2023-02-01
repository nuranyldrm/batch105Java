package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public C01_LinkedList() {
    }

    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList();
        ll1.add("K");
        ll1.add("T");
        List<String> ll2 = new LinkedList();
        ll2.add("R");
        ll2.add("Z");
        ll2.add(0, "A");
        ll2.addAll(2, ll1);
        ll2.set(3, "M");
        System.out.println((String)ll2.get(1));
        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2);
        System.out.println(ll2.retainAll(ll1));
        System.out.println(ll2);
        ll2.add("A");
        System.out.println(ll2.hashCode());
        System.out.println(ll2.subList(2, 4));
    }
}

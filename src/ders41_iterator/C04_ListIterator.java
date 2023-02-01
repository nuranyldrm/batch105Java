package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public C04_ListIterator() {
    }

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        ListIterator lit = sayilar.listIterator();

        while(lit.hasNext()) {
            lit.next();
        }

        while(lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        System.out.println("");
        System.out.println(lit.nextIndex());

        while(lit.hasNext()) {
            lit.set((Integer)lit.next() + 5);
        }

        System.out.println(sayilar);

        while(lit.hasPrevious()) {
            if ((Integer)lit.previous() < 40) {
                lit.remove();
            }
        }

        System.out.println(sayilar);
    }
}



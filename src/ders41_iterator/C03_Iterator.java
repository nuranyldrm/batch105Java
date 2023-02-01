package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public C03_Iterator() {
    }

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        Iterator it1 = sayilar.iterator();

        while(it1.hasNext()) {
            Integer element = (Integer)it1.next();
            if (element > 15 && element < 35) {
                it1.remove();
            }
        }

        System.out.println(sayilar);
        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);
        Iterator it2 = sayilar.iterator();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();

        while(it2.hasNext()) {
            it2.next();
            it2.remove();
        }

        System.out.println(sayilar);
    }
}


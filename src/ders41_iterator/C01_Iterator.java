package ders41_iterator;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public C01_Iterator() {
    }

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        Iterator var2 = sayilar.iterator();

        Integer each;
        while(var2.hasNext()) {
            each = (Integer)var2.next();
            System.out.print("" + each + " ");
        }

        System.out.println("");
        var2 = sayilar.iterator();

        while(var2.hasNext()) {
            each = (Integer)var2.next();
            PrintStream var10000 = System.out;
            int var10001 = each;
            var10000.print(var10001 + 1 + " ");
        }

        System.out.println("");
        System.out.println(sayilar);
        var2 = sayilar.iterator();

        while(var2.hasNext()) {
            each = (Integer)var2.next();
            each = each + 1;
            System.out.print("" + each + " ");
        }

        System.out.println("");
        System.out.println(sayilar);
    }
}


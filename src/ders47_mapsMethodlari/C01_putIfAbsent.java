package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_putIfAbsent {
    public C01_putIfAbsent() {
    }

    public static void main(String[] args) {
        Map<String, Integer> mp1 = new HashMap();
        mp1.put("A", 5);
        mp1.put("B", 3);
        mp1.put("C", 7);
        System.out.println(mp1.putIfAbsent("D", 9));
        System.out.println(mp1);
        System.out.println(mp1.putIfAbsent("D", 15));
        System.out.println(mp1);
        Map<Integer, String> mp2 = new HashMap();
        mp2.put(2, "S");
        System.out.println((String)mp2.putIfAbsent(3, "K"));
        System.out.println(mp2);
        System.out.println((String)mp2.putIfAbsent(3, "Z"));
        System.out.println(mp2);
    }
}

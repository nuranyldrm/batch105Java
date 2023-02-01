package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C05_replace {
    public C05_replace() {
    }

    public static void main(String[] args) {
        Map<String, Integer> mp1 = new HashMap();
        mp1.put("A", 5);
        mp1.put("B", 3);
        mp1.put("C", 7);
        System.out.println(mp1.replace("C", 10));
        System.out.println(mp1);
        System.out.println(mp1.replace("D", 9));
        System.out.println(mp1);
        System.out.println(mp1.replace("B", 3, 12));
        System.out.println(mp1);
        System.out.println(mp1.replace("B", 7, 13));
        System.out.println(mp1);
        System.out.println(mp1.getOrDefault("C", 44));
        System.out.println(mp1.getOrDefault("D", 44));
    }
}

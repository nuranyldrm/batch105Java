package ders47_mapsMethodlari;

import java.util.TreeMap;

public class C06_TreeMap {
    public C06_TreeMap() {
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> mp1 = new TreeMap();
        mp1.put("A", 5);
        mp1.put("H", 3);
        mp1.put("C", 7);
        mp1.put("T", 3);
        mp1.put("F", 8);
        System.out.println(mp1);
        System.out.println((String)mp1.higherKey("D"));
        System.out.println((String)mp1.higherKey("H"));
        System.out.println((String)mp1.higherKey("U"));
        System.out.println(mp1.higherEntry("M"));
        System.out.println((String)mp1.lowerKey("F"));
        System.out.println(mp1.lowerEntry("G"));
        System.out.println((String)mp1.floorKey("D"));
        System.out.println((String)mp1.floorKey("H"));
        System.out.println(mp1.floorEntry("L"));
        System.out.println(mp1.floorEntry("T"));
        System.out.println((String)mp1.ceilingKey("F"));
        System.out.println((String)mp1.ceilingKey("B"));
        System.out.println(mp1.ceilingEntry("H"));
        System.out.println(mp1.headMap("F"));
        System.out.println(mp1.headMap("K"));
        System.out.println(mp1.headMap("F", true));
        System.out.println(mp1.headMap("N", true));
        System.out.println(mp1.tailMap("F"));
        System.out.println(mp1.tailMap("D"));
        System.out.println(mp1.tailMap("F", false));
        System.out.println(mp1.descendingMap());
        System.out.println((String)mp1.firstKey());
        System.out.println(mp1.firstEntry());
        System.out.println((String)mp1.lastKey());
        System.out.println(mp1.lastEntry());
        System.out.println(mp1.pollFirstEntry());
        System.out.println(mp1);
        System.out.println(mp1.pollLastEntry());
        System.out.println(mp1);
        System.out.println(mp1.subMap("B", "G"));
        System.out.println(mp1.subMap("C", "H"));
        System.out.println(mp1.subMap("C", false, "H", true));
    }
}

package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_compute {
    public C03_compute() {
    }

    public static void main(String[] args) {
        Map<String, Integer> mp1 = new HashMap();
        mp1.put("A", 5);
        mp1.put("B", 3);
        mp1.put("C", 7);
        if (mp1.containsKey("C")) {
            mp1.put("C", (Integer)mp1.get("C") + 3);
        }

        System.out.println(mp1);
        mp1.computeIfPresent("B", (k, v) -> {
            return 2 * v;
        });
        System.out.println(mp1);
        System.out.println(mp1.computeIfPresent("A", (k, v) -> {
            return v - 5;
        }));
        System.out.println(mp1);
        if (!mp1.containsKey("D")) {
            mp1.put("D", 11);
        }

        System.out.println(mp1);
        mp1.computeIfAbsent("E", (v) -> {
            return 8;
        });
        System.out.println(mp1);
        mp1.compute("E", (k, v) -> {
            return v + 4;
        });
        System.out.println(mp1);
        mp1.compute("R", (k, v) -> {
            return 3;
        });
        System.out.println(mp1);
        mp1.compute("F", (k, v) -> {
            return v * 3;
        });
        System.out.println(mp1);
    }
}

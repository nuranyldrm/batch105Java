package ders47_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C04_Soru {
    public C04_Soru() {
    }

    public static void main(String[] args) {
        String str = "Javayi balonu patlatmadan bitirelim";
        String[] strArr = str.split("");
        Map<String, Integer> kullanimMiktarlariMap = new TreeMap();

        for(int i = 0; i < strArr.length; ++i) {
            kullanimMiktarlariMap.computeIfPresent(strArr[i], (k, v) -> {
                return v + 1;
            });
            kullanimMiktarlariMap.putIfAbsent(strArr[i], 1);
        }

        System.out.println(kullanimMiktarlariMap);
    }
}

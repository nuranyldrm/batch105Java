package ders45_maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public C01_Maps() {
    }

    public static void main(String[] args) {
        String str = "Javayi balonu patlatmadan bitirelim";
        String[] harflerArr = str.split("");
        Map<String, Integer> kullanimMiktarlariMap = new TreeMap();
        int sayac = 1;

        for(int i = 0; i < harflerArr.length; ++i) {
            if (!kullanimMiktarlariMap.containsKey(harflerArr[i])) {
                for(int j = i + 1; j < harflerArr.length; ++j) {
                    if (harflerArr[j].equals(harflerArr[i])) {
                        ++sayac;
                    }
                }

                kullanimMiktarlariMap.put(harflerArr[i], sayac);
                sayac = 1;
            }
        }

        System.out.println(kullanimMiktarlariMap);
    }
}

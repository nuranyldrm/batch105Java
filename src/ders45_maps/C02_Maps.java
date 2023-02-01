package ders45_maps;

import ders44_maps.MapDepo;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public C02_Maps() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();
        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        System.out.println(ogrenciValueCollection);
        System.out.println(ogrenciValueCollection.size());
    }
}

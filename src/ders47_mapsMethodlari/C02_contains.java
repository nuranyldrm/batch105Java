package ders47_mapsMethodlari;


import ders44_maps.MapDepo;
import java.util.Map;

public class C02_contains {
    public C02_contains() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.containsKey(105));
        System.out.println(ogrenciMap.containsKey(111));
        System.out.println(ogrenciMap.containsValue("10"));
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-M-Soz"));
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-M-Soy"));
    }
}

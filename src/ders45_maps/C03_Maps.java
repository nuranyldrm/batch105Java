package ders45_maps;

import ders44_maps.MapDepo;
import java.util.Map;

public class C03_Maps {
    public C03_Maps() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        ogrenciMap.put(107, "Hasan-Yan-12-H-MF");
        ogrenciMap.put(101, "Adem-Fan-12-T-Soz");
        String subeAdi = "H";
        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap, subeAdi);
    }
}

package ders44_maps;

import java.util.Map;

public class C02_Maps {
    public C02_Maps() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        ogrenciMap.put(105, "Hasan-Can-11-K-MF");
        ogrenciMap.put(108, "Hikmet-Han-10-M-TM");
        System.out.println(ogrenciMap);
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 108));
        int ogrenciKey = 105;
        String yeniSube = "N";
        ogrenciMap = MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, ogrenciKey, yeniSube);
        System.out.println(ogrenciMap);
    }
}

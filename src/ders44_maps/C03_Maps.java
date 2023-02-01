package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public C03_Maps() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        ogrenciMap.put(110, "Fatih-Yan-10-T-MF");
        ogrenciMap.put(102, "Veli-Dem-12-D-Soz");
        System.out.println(MapDepo.isimSoyisimDondur(ogrenciMap, 103));
        ogrenciMap = MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, 105, "T");
        System.out.println(ogrenciMap);
    }
}

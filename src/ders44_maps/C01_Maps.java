package ders44_maps;

import java.util.Map;

public class C01_Maps {
    public C01_Maps() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println((String)ogrenciMap.get(104));
        int ogrenciKey = 106;
        String isimSoyisim = MapDepo.isimSoyisimDondur(ogrenciMap, ogrenciKey);
        System.out.println("" + ogrenciKey + " nolu ogrenci isim ve soyismi : " + isimSoyisim);
    }
}

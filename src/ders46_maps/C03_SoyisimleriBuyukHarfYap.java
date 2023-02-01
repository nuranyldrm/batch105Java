package ders46_maps;

import ders44_maps.MapDepo;
import java.util.Map;

public class C03_SoyisimleriBuyukHarfYap {
    public C03_SoyisimleriBuyukHarfYap() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMapi = MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109, "Adem-Demir-11-D-Soz");
        ogrenciMapi = MapDepo.soyisimleriBuyukharfYap(ogrenciMapi);
        System.out.println(ogrenciMapi);
    }
}

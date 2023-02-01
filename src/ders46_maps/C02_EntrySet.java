package ders46_maps;


import ders44_maps.MapDepo;
import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public C02_EntrySet() {
    }

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMapi = MapDepo.ornekMapOlustur();
        ogrenciMapi.put(109, "Adem-Demir-11-D-Soz");
        Set<String> siraliOgrenciListesi = MapDepo.siraliOgrenciListesiOlustur(ogrenciMapi);
        System.out.println(siraliOgrenciListesi);
    }
}
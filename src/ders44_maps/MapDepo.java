package ders44_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapDepo {
    public MapDepo() {
    }

    public static Map<Integer, String> ornekMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap();
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");
        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {
        String ogrenciValue = (String)ogrenciMap.get(ogrenciKey);
        String[] valueArr = ogrenciValue.split("-");
        String isimSoyisim = valueArr[0] + " " + valueArr[1];
        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {
        if (ogrenciMap.containsKey(ogrenciKey)) {
            String istenenKeyinValuesu = (String)ogrenciMap.get(ogrenciKey);
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-");
            istenenKeyvalueArr[3] = yeniSube;
            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" + istenenKeyvalueArr[1] + "-" + istenenKeyvalueArr[2] + "-" + istenenKeyvalueArr[3] + "-" + istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }

        return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Isim      Soyisim     Sinif");
        System.out.println("===========================");
        Iterator var3 = valueCollection.iterator();

        while(var3.hasNext()) {
            String eachValue = (String)var3.next();
            String[] valueArr = eachValue.split("-");
            if (valueArr[3].equals(subeAdi)) {
                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }
        }

    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();
        List<String> isimListesi = new ArrayList();
        Iterator var8 = ogrenciKeySeti.iterator();

        while(var8.hasNext()) {
            Integer eachKey = (Integer)var8.next();
            if (basNo <= eachKey && eachKey <= bitNo) {
                String value = (String)ogrenciMap.get(eachKey);
                String[] valueArr = value.split("-");
                String istenenIsim = valueArr[0] + " " + valueArr[1] + " " + valueArr[4];
                isimListesi.add(istenenIsim);
            }
        }

        return isimListesi;
    }

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {
        Set<Integer> keySeti = ogrenciMap.keySet();
        Iterator var4 = keySeti.iterator();

        while(var4.hasNext()) {
            Integer eachKey = (Integer)var4.next();
            String value = (String)ogrenciMap.get(eachKey);
            String[] valueArr = value.split("-");
            System.out.println("" + eachKey + " " + valueArr[0] + " " + valueArr[1]);
        }

    }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {
        Set<String> siraliOgrenciSeti = new TreeSet();
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMapi.entrySet();
        Iterator var6 = ogrenciEntrySeti.iterator();

        while(var6.hasNext()) {
            Map.Entry<Integer, String> eachEntry = (Map.Entry)var6.next();
            String value = (String)eachEntry.getValue();
            String[] valueArr = value.split("-");
            String istenenBilgi = valueArr[4] + ", " + valueArr[2] + ", " + valueArr[3] + ", " + valueArr[0] + " " + valueArr[1] + ", " + eachEntry.getKey();
            siraliOgrenciSeti.add(istenenBilgi);
        }

        return siraliOgrenciSeti;
    }

    public static Map<Integer, String> soyisimleriBuyukharfYap(Map<Integer, String> ogrenciMapi) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMapi.entrySet();
        Iterator var5 = ogrenciEntrySeti.iterator();

        while(var5.hasNext()) {
            Map.Entry<Integer, String> eachEntry = (Map.Entry)var5.next();
            String value = (String)eachEntry.getValue();
            String[] valueArr = value.split("-");
            valueArr[1] = valueArr[1].toUpperCase();
            eachEntry.setValue(valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4]);
        }

        return ogrenciMapi;
    }
}

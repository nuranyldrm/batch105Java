package ders46_maps;

import ders44_maps.MapDepo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public C01_EntrySet() {
    }
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size());
        ogrenciMap.put(108, "Mehmet-Erkan-12-K-MF");
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        int siraNo = 1;

        Iterator var4;
        Map.Entry eachEntry;
        for(var4 = ogrenciEntrySeti.iterator(); var4.hasNext(); ++siraNo) {
            eachEntry = (Map.Entry)var4.next();
            System.out.println("" + siraNo + "-   " + eachEntry);
        }

        var4 = ogrenciEntrySeti.iterator();

        while(var4.hasNext()) {
            eachEntry = (Map.Entry)var4.next();
            System.out.println(eachEntry.getKey());
        }

        Iterator var6 = ogrenciEntrySeti.iterator();

        while(var6.hasNext()) {
            Map.Entry<Integer, String> eachEntry1 = (Map.Entry)var6.next();
            String entryValue = (String)eachEntry1.getValue();
            String[] entryValueArr = entryValue.split("-");
            if (entryValueArr[2].equals("12")) {
                eachEntry1.setValue("Mezun oldu");
            } else {
                int sinif = Integer.parseInt(entryValueArr[2]);
                ++sinif;
                entryValueArr[2] = "" + sinif;
                eachEntry1.setValue(entryValueArr[0] + "-" + entryValueArr[1] + "-"
                        + entryValueArr[2] + "-" + entryValueArr[3] + "-" + entryValueArr[4]);
                // eachEntry whıle den sonrasına 1 dedım hata verdigi icin öyle duzeldi
            }
        }

        System.out.println(ogrenciMap);
    }
}


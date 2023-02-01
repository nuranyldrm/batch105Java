package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {
//        Verilen String bir array’deki her bir elementi kontrol edip,
//        - Kelimenin uzunlugu cift sayi ise ilk yarisini
//        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
//        yeni bir listeye ekleyip yazdirin.

        String[] arr = new String[]{"Sumeyra", "Mehmet", "Ekrem", "Yilmaz", "Ayse"};
        List<String> yeniList = new ArrayList();
        String[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String each = var3[var5];
            if (each.length() % 2 == 0) {
                yeniList.add(each.substring(0, each.length() / 2));
            } else {
                yeniList.add(each.substring((each.length() - 1) / 2));
            }
        }

        System.out.println(yeniList);
    }
}


package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_indexOf {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};
        List<Integer> sayilar = new ArrayList();

        for(int i = 0; i < arr.length; ++i) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.indexOf(2)); // sayının kullanıldıgı ilk indeksi veririr
        System.out.println(sayilar.indexOf(5));
        System.out.println(sayilar.lastIndexOf(5)); // sayının son  kullanıldıgı indeksi verir
    }
}


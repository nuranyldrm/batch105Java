package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_contains {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList();
        int[] arr = new int[]{2, 5, 7, 9, 1, 0, 4, 5, 6, 3, 5, 4, 6};

        for(int i = 0; i < arr.length; ++i) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar.contains(3)); // 3 iceriyormu true
        System.out.println(sayilar.contains(8));
    }
}


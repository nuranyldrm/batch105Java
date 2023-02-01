package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03_Set {
    public C03_Set() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 3, 2, 3, 5, 6, 4, 3, 2, 4, 6, 3, 2, 1, 2, 4, 5, 5, 1};
        Set<Integer> geciciSet = new HashSet();
        int[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Integer each = var3[var5];
            geciciSet.add(each);
        }

        arr = new int[geciciSet.size()];
        int index = 0;

        for(Iterator var8 = geciciSet.iterator(); var8.hasNext(); ++index) {
            Integer each = (Integer)var8.next();
            arr[index] = each;
        }

        System.out.println(Arrays.toString(arr));
    }
}



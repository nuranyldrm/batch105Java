package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{4, 3, 1}, {1, 2}, {5, 6, 7}, new int[0], {3, 6, 8, 0}};
        System.out.println(arr.length);
        System.out.println(arr[2].length);
        System.out.println(arr[1]); // direk yazdırılmaz ,java referansı yazdırır
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.deepToString(arr));// tüm arrayi yazdırır
        System.out.println(arr[3][0]);// hata verir içi bos oldugu ıcın index bulamaz

    }
}


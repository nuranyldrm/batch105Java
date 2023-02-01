package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 9, 3, 7, 2, 5, 8, 1};
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 9));
        /*
        binary search  methodunun dogru sonuclar verilebilmesi için öncelikle sort methodu kullanılmalıdır

        sort () kullanmadan binarySearch () ile yapılan aramanın sonucu belli olmaz
        dogru sonuc da verebilir ,yanlıs sonuc da
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 9));

        // arry da olmayan bir eleman aratırsak eksi - verir
        // array da olsa nerede olurdu onu veririr bu sırayı eksı ısaretiyle verir
        System.out.println(Arrays.binarySearch(arr, -3));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 100));
    }
}



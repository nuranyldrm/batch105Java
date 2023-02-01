package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    // verilen bir int array den en küçük ve en büyük sayıları
    //yazdıran bir method olusturun

    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 1, 5, 2, 9};
        enBuyukEnKucukElementYazdir(arr);
    }

    public static void enBuyukEnKucukElementYazdir(int[] arr) {
        Arrays.sort(arr); // bu kod otomotik buyukten kucuge lısteler
        System.out.println("En buyuk element : " + arr[arr.length - 1]);
        System.out.println("En kucuk element : " + arr[0]);
    }
}

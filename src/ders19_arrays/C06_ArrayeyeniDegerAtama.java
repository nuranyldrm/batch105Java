package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeyeniDegerAtama {
    public static void main(String[] args) {
        String str = "java";
        str = "hava";
        String[] arr1 = new String[]{"Ali", "Veli"};
        String[] arr2 = new String[]{"A", "B", "C"};
        System.out.println(Arrays.toString(arr2));
        // var olan bir arry ın uzunlugu degistirilemez
        // var olan bir arry a yeni bir array degeri atanabilir
        //1- var olan bir array i yeni deger olarak atayabiliriz
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));
        // istedigimiz uzunlukta yeni bos bir aRRAY degeri atayabiliriz
        arr1 = new String[6];
        System.out.println(Arrays.toString(arr1));// null null null
        //3- yeni olusturulan bir array e {} icinde deger yazarak atama yapabilirz
        // ancak var olan bir array e yeni deger ataması icin {} KULLANILAMAZ

        //arr={"g","h"};olmaz

        int[] arr5 = new int[]{3, 4, 5}; // bu olur
    }
}

package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6};
        // bu arr e 4. bir element olarak 8 i ekleyelım
        /*
        var olan bir array eyeni elemant eklenemez fakat yeni deger atanabilir
        önce int[] arr2 = [2,4,6,8] seklinde yeni bir arry olusturup sonra arr2 degerini arr ye atabiliriz

         */

        // yeni arry olusturalım
        // arr2 e konulacak dataların turu
        // uzunlugu ise eski arry in uzunlugunun 1 fazlası olmalı

        int[] arr2 = new int[arr.length + 1]; // [0,0,0,0]

        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
        arr2[arr2.length - 1] = 8;// son elementi 8 yapmak ıcın

        System.out.println(Arrays.toString(arr2));
        // arr array ine yeni degeer olarak olusturdugumuz arr2 yı atayacagız

        arr=arr2;
        System.out.println("arr'nin son hali : " + Arrays.toString(arr));
    }
}

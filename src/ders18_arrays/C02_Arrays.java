package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] arr = new String[]{"Ali", "Ulus", "Nesrin"};
        // bu array ın tüm elementlerinde aralarında bir bosluk bırakarak yazdırın

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        //  bu array i array olarak yazdırın .
        System.out.println(arr); // bu array bir obje non primivite bir daha oldugundan referansını yazdırır
        // array i array olarak yazdrmak istersek javadan arrays claSS sından yardım almamız gerekir
        System.out.println(Arrays.toString(arr));//[Ali, Ulus, Nesrin] array yazılısı
   }
}

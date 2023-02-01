package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5};
        elemntleri5Artir(arr);
        elemntleri5Artir(arr);
        elemntleri5Artir(arr);
        System.out.println("Method call'dan sonra main method icinde arr : " + Arrays.toString(arr));
    }

    public static void elemntleri5Artir(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            arr[i] += 5;
        }

        System.out.println(Arrays.toString(arr));
    }
}



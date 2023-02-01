package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {
        //verilen bir int array in elementlerini 3 arttırın

        int[] arr = new int[] {2, 3, 4};

        arr = C03_ArrayElementleriniArtirma.elementlerİkiArtır(arr);

        System.out.println(Arrays.toString(arr));
        // arr  arr yının elemntlerini toplayıp sonucu yazdrın

        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));

        // arr arryınde 10 element ini arama varmı?

        C05_ArraydeElemanArama.elemanAra(arr, 10); // aranan sayı yok

        // kullanıcıdan deger alara bır arry olusturun

        int[] yeniArr = C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }

}

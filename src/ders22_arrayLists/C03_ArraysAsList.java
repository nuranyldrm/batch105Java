package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {
        // verilen bir array i list e cevirmek icin
        //bir list olusturup for loop ile elementleri tasımayı tavsiye ediyoruz
        Integer[] arr = new Integer[]{1, 2, 3};
        List<Integer> arraydenList = Arrays.asList(arr);
        System.out.println(arraydenList);
        // bu yöntemın 2 negatıf durumu vardır
        //1- bu sekılde olusturulan lıst ler esnek uzunluga sahip degildirler
        // add, remove gibi özellikler kullanmak ıstersenız RunTımeException olusur
        //arraydenList.add(10,);unsupportedOperatinException
        //arraydenList.remove(1),);unsupportedOperatinException
        // bu yöntem kaynak olan arrY İLE OLUSTURULAN list i birbirine baglar
        //birinde yaptıgınız degisikligi otomotık olarak dıgerıne de yansıtır

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Liste : " + arraydenList);
        // sadece array ın n-bir elemanını degistirelim
        arr[0] = 10;
        System.out.println("array'i degistirince Array : " + Arrays.toString(arr));
        System.out.println("array'i degistirince Liste : " + arraydenList);
    }
}



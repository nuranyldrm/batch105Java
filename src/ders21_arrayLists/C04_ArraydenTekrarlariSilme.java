package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    // verilen bir arry deki tekrar eden sayıları
    // bir kere olacak sekılde array de duzenleyın
    // bu soruyu array ile yapmak cok zor
    // bu array in elemanlarını tek tek inceleyıp
    // tekrarsız olanları bir list e atalım
    // en son o list deki elementleri array e atamak gerekir
    // bunun için önce array e yeni bos bir array degeeri atayıp
    // sonra list deki elementleri array a tasıyalım
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};
        List<Integer> tekrarsizListe = new ArrayList();

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (!tekrarsizListe.contains(arr[i])) { // aynı seyleri içermiyorsa basında unlem var
                tekrarsizListe.add(arr[i]);
            }
        }

        System.out.println("tekrarsiz liste : " + tekrarsizListe);
        arr = new int[tekrarsizListe.size()]; // tekrarsız listenin booyu kdar

        for(i = 0; i < arr.length; ++i) {
            arr[i] = (Integer)tekrarsizListe.get(i);
        }

        System.out.println("Array'in tekrarsiz hali : " + Arrays.toString(arr));
    }
}


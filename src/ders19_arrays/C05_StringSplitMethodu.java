package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        String str = "java gercekten cok cok guzel";
        // verilen stringte kac tane e harfi vardır bulunuz
        String[] eArrayi = str.split("e");
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);
        System.out.println("Metindeki e sayisi : " + (eArrayi.length - 1));
        // 2. yöntem
        // String i "" hıclık ile split yaparak karakterlerine ayıralım
        String[] tumKarakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));

        int sayac = 0;
        // bir loop ile tum karaterleri kontrol edelim

        for(int i = 0; i < tumKarakterlerArr.length; ++i) {
            if (tumKarakterlerArr[i].equals("e")) {
                ++sayac;
            }
        }

        System.out.println("Metindeki e sayisi : " + sayac);
    }
}

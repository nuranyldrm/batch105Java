package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    //Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
    //tamsayilari bir liste olarak bize donduren bir method olusturun.

    public static void main(String[] args) {
        int girilenSayi = 1280;
        if (girilenSayi<=0){
            System.out.println("egecrsiz sayi");
        }else {
            List<Integer>tamBölenlerListesi=tamBolenlerListesiOlustur(girilenSayi);
            System.out.println(tamBolenlerListesiOlustur(girilenSayi));
        }

    }

    public static List<Integer> tamBolenlerListesiOlustur(int girilenSayi) {
        List<Integer> tamBolenlerListesi = new ArrayList();

        for(int i = 1; i <= girilenSayi; ++i) {
            if (girilenSayi % i == 0) { // tam bölen demektir kalan sıfır
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;
    }
}



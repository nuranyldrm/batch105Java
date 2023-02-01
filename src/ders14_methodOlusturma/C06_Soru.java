package ders14_methodOlusturma;

public class C06_Soru {

    public static void main(String[] args) {
        //Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

        String isim = "OMER";
        String soyisim = "kesen";
        System.out.println(isimsoyisimDuzenle(isim, soyisim));
        System.out.println(isimsoyisimDuzenle("Heysem", "RENKOGLU"));
    }

    public static String isimsoyisimDuzenle(String isim, String soyisim) {
        String var10000 = isim.substring(0, 1).toUpperCase();
        String yeniIsimSoyisim = var10000 + isim.substring(1).toLowerCase() +
                                            " " + soyisim.substring(0, 1).toUpperCase() +
                                             soyisim.substring(1).toLowerCase();
        return yeniIsimSoyisim;
    }
}

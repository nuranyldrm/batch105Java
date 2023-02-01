package ders11_stringManipulation;

public class C07_Soru {

    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- esit veya soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.

        String isim = "MEHMet";
        String soyisim = "HARuNGIL";
        String var10000;
        String yeniIsimSoyisim;
        if (isim.length() > soyisim.length()) {
            //ismi daha uzun ise, isim ve soyisn ilk harf buyuk kalanlar kucuk seklinde
            //        //yazdirin
            var10000 = isim.substring(0, 1).toUpperCase();
            yeniIsimSoyisim = var10000 + isim.substring(1).toLowerCase() +
                                        " " +
                                         soyisim.substring(0, 1).toUpperCase() +
                                         soyisim.substring(1).toLowerCase();
        } else {
            //esit veya soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
            //        //harflerle yazdirin.
            var10000 = isim.substring(0, 1).toUpperCase();
            yeniIsimSoyisim = var10000 + isim.substring(1).toLowerCase() +
                                        " " + soyisim.toUpperCase();
        }

        System.out.println(yeniIsimSoyisim);
    }
}

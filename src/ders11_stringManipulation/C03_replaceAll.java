package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        /*
        replaceAll = char kullanılmaz String kullanılır
        str.replaceFirst ( degisecekString , yeniDeger );
      Bir String’in icinde bulunan degisecekString’lerden ilkini yeniDeger yapar.
          degisecekString String olabilecegi gibi regex de olabilir
        Regex (Regular Expressions)
         \\s : space \\S : space olmayan hersey
         \\s+ : yanyana birden fazla space
         \\d : digits \\D : digit olmayan hersey
          \\w : harf veya rakam \\W : harf veya rakam olmayan hersey
         */
        String str = "J1ava2 G9uzel5dir8";
        // str daki sayiları silip metni java guzeldir haline donusturelım
        // str.replaceAll () sadece bir harf veya char sequence i degil
        // genelleme ile soyleyebilecegımız ortak ozellikteki tum karakterlerı degistirir.

        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\D", ""));
        String s1 = "ilk urun fiyati : 1250 tl";
        String s2 = "ikinci urun fiyati : 1500 tl";
        //ıkı urunun fiyatını toplayın
        s1 = s1.replaceAll("\\D", "");
        s2 = s2.replaceAll("\\D", "");
        System.out.println(s1 + s2);// yanyana toplar
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); // iki sayıyı matematiksel toplar
    }
}
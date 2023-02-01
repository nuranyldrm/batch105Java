package ders09_StringManipulations;

public class C07_substring {
    public C07_substring() {
    }

    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(5, 8));
        // 5, indexten baslar (8-5) karakter yazdırır
        // 5. index dahil ( inculusive ) 8, haric (exclusive)

        System.out.println(str.substring(9, 17));
        // gectikce

        System.out.println(str.substring(3, 7));

        String isim = "huseYIN";
        // verilen ismi ılk harfi buyuk ,geriye kalan harfleri kucuk kaydedın
        String var10000 = isim.substring(0, 1).toUpperCase();// ilk harfi buyuk yaptık
        isim = var10000 + isim.substring(1).toLowerCase(); //1. index ve sonrasinı alıp kucuk harf yaptık
        // bu kod her isime uyum saglar dinamık koddur

        System.out.println(isim);
        System.out.println(isim.substring(2, 5));
        System.out.println(isim.substring(3, 4));// sadece 3, indextekini yazdıra
        System.out.println("zor sorunun cevabi : " + isim.substring(2, 2));// 2 de baslar ıkıde biter o yuzden hıclık yazdırır
        //System.out.println(isim.substring(5,2)); // hata verir .StringIndexOutOfBoundsException
    }
}

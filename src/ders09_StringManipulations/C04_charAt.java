package ders09_StringManipulations;

public class C04_charAt {
    public C04_charAt() {
    }

    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.charAt(0)); // ilk harfi verir J
        System.out.println(str.charAt(5)); // 5. index deki charı verir (boslukta sayılır) C
        System.out.println(str.charAt(10)); // sonuncu karakteri yazdırın  r

        /*
        bir metindeki karakter sayısı ile index arasında bir sayı fark vardır
        cunku sıfırdan baslıyoruz
        bu metin için karakter sayısı 11 son index 10 dur

         */

      //  System.out.println(str.charAt(11)); //StringIndexOutOfBoundsException hATASI VERİR SINIRLARIN DISINDA DEMEK


    }
}


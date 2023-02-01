package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {
        //For döngüsü, bir görevin kaç kez
        //tekrarlanacağını bildiğinizde kullanışlıdır

        // dıkkat
       /*

        // dıkkat  SONSUZ LOOP eger bu kodu calıstırırsak bilgisayar ram dolup cokene kadar calısır

        /*
        for(int i = 0; i > 10; ++i) {
            System.out.println(i);
        }
        */
        //ilk deger için bitis sartı true olmuyorsa
        //for body si hıc devreye girmez

        for(int i = 0; i > 10; ++i) {
            System.out.println(i);
        }

        // bir loop u sonunu beklemeden bitirmek ıstersek
        // kullanıcının verdiği sayının asal sayı olup olmadıgını bulun
        //asal sayı :1 ve kendısı dısında hic bir tam sayıya tam bölunmeyen sayı
        int sayi = 230;
        boolean bayrak = false;

        for(int i = 2; i <= sayi - 1; ++i) {
            if (sayi % i == 0) {
                bayrak = true;// sart kod calısmaz
                break;// sart degil kod calsıır loopun durmasını ıstıyorsak
            }
        }

        System.out.println(bayrak);
        if (bayrak) {
            System.out.println("asal sayi degil");
        } else {
            System.out.println("asal sayi");
        }

    }
}

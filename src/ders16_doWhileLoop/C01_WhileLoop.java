package ders16_doWhileLoop;

public class C01_WhileLoop {


    public static void main(String[] args) {
        // 10-11-12 sayılarını toplayan bir while loop olusturalım
        int sayi = 10;
        int toplam=0;

        //for (int toplam1 = 0; sayi <= 12; ++sayi) {
        //    toplam1 += sayi;
        //}
        /*for ıle yapılan */

        while (sayi<=12){
            toplam+=sayi;
            sayi++;

        }
        /*
        while loop da 2 problem olusabilir
        1-önce degeri kontrol edip , sonra islem yaptıgımızdan
        body de bir kere daha kontrol etmemiz gerekebilir
        2-yapılan islem sayısından 1fazla while bitis sartı kontrol edilebiilir
        3-while loop öncesinde degerleri kontrol edecegımız bir veriable olusturuyorsak
        ona yapacagımız atamayı dikkatli  yapmamıs gerekir
        yanlıs deger ataması yapmak while loop un calısmamamsına neden olabilir
         */

    }}

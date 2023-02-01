package ders12_forLoops;

public class C03_Faktoryel {

    public static void main(String[] args) {
        // kullanıcının verdiği sayının faktorıyelını bulalım

        //5! =5*4*3*2*1=120
        int sayi = 10;
        int faktoryel = 1;

        for (int i =sayi; i >=1 ; i--) {
            faktoryel=faktoryel*i;
        }
        //yada bu sekıldede de yapılabilir
       // int toplam;
        // for(toplam = sayi; toplam >= 1; --toplam) {
        //            faktoryel *= toplam;
        //        }


        int toplam;


        System.out.println(faktoryel);
        toplam = 0;
        // 1 den 100 e kadar olan sayıları toplayın sınırlar dahil

        for(int i = 1; i <= 100; ++i) {
            toplam += i;
        }

        System.out.println(toplam);
    }
}

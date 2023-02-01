package ders03_datacastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {
        /* bazı data turlerı asla birbirine cast edilemez*/

        //String str=20;    cift tırnak koymak gerek

       // boolean mutlumu="true";     tırnak dısına cıkarmak gerek

        //int a=true;    gibi   harf olmalı
         double s = 20 ;
         int sayi = 15 ;
         long ln = sayi ; //esitligin sol tarafı long, sag tarafı yanı deger int
                           // java itiraz etmedi
        /* dar data turundeki bir degeri genis bir data turunendeki veriable a atama yaparsanız
        java bunu otomotık yapar
         */
        short sh=23;
        int a=sh;
        long lng= sh;
        float fl=lng;

        /* ama tersini yapmak isterseniz yani buyuk bır data turundeki bir degeri
        kucuk data turundeki veriable  a atamak isterseniz java kabul etmez
         */
        double dbl =20;

        //a= dbl ;

        //short abc= dbl ;

    }
}

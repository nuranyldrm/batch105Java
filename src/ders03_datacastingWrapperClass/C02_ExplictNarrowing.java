package ders03_datacastingWrapperClass;

public class C02_ExplictNarrowing {
    public static void main(String[] args) {
        int sayi=20;
        /* genis data turundeki bir degeri dar data turundeki bir veriable a atamak isterseniz
         java sorumluluğu almanızı ister

         bu sorumlulugu almak için cast edecegımız deger in önune () parantez icinde cast etmek
         istedigimiz data turu yazılır .

         ancak bu durumda data kayıpları (double den int e gecerken vrgulden sonrası sılınır )
         veya baskalasım olabilir (int i byte cevirirsek tekrar tekrar basa döner )

         */

        short sh=(short) sayi;
        System.out.println(sh);//20

        double dbl = 23.5;

        int say=(int)dbl;
        System.out.println(say); //23 cıkar virgulden sonrasını atar

        say=15;
        byte byt=(byte) say;
        System.out.println(byt);//15

    }
}

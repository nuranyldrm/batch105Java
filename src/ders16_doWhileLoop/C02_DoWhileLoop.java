package ders16_doWhileLoop;

public class C02_DoWhileLoop {

                  public static void main(String[] args) {
                      //// 10-11-12 sayılarını toplayan bir while loop olusturalım
            int sayi = 10;
            int toplam = 0;

            do {
                toplam += sayi;
                ++sayi;
            } while(sayi <= 12);

            /*
            do while lop un 2 avantajı vardır
            1-loop body sı en az bir kere calısır
            (while loop baslangıc degeri uygun degilse ,loop body si hıc calısmaya bilir)
            2-while bitis kontrolu loop kadar calısır
            (while loop da bir kere fazla calsırdı )
             */
}}


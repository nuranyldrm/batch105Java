package ders08_Ternary;

public class C03_Ternary {
    public C03_Ternary() {
    }

    public static void main(String[] args) {
        int a = 5;
        //  ternery operatörü tek basına kullanılamaz basına strıng yazdıgımız yer kasıt
        // cunku ternery bıze sonu uretir

        // bu sonucu ya direk yazdırmalı veya veriable atamalıyız


        String sonuc = a % 2 == 0 ? "cift sayi" : "tek sayi";
        if (a > 10) {

            // ternery nın sonucunu bir veriable a atyacaksak
            // true ve false durumlarında uretilerecek sonucun aynı data turunden olması gerekır
            // aksi halde CTE hata olusur
            // ama ternery sout içinde kullanırsak
            // sonucların daha turunun aynı olması sart olmaz

            String sonuc2= a>10 ? "büyük sayi " : ""+2*a ; //CTE vermemesi icin stringe cevirdik
            System.out.println( a>10 ? "büyük sayi" : 2*a);


            String var10000 = "buyuk sayi";
        } else {
          //(2 * a).makeConcatWithConstants<invokedynamic>(2 * a);
            a = a +2;
        }

        System.out.println(a > 10 ? "buyuk sayi" : 2 * a);
    }

}
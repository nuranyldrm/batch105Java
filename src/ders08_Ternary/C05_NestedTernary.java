package ders08_Ternary;

public class C05_NestedTernary {

        public static void main(String[] args) {

//            // kullanıcıdan bir tam sayı alın
//            sayı pozıtıf ise , çift sayı veyaz cift sayı degil secneklerinden uygun olanı yazdırın
//
//                    sayı pozıtıf degilse , 3 basamaklı veyaz 3 basamaklı degil secenklerınden uygun olanı yazdırın


            int sayi = 20;
            if (sayi > 0) {

//                ayı pozıtıf ise , çift sayı veyaz cift sayı degil secneklerinden uygun olanı yazdırın
                System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Cift sayi degil");
            } else {
//                sayı pozıtıf degilse , 3 basamaklı veyaz 3 basamaklı degil secenklerınden uygun olanı yazdırın
                System.out.println(sayi < -99 && sayi > -1000 ? "Uc basamakli" : "Uc basamakli degil");
            }
            String sonuc= sayi>0
                          ?
                    sayi % 2 == 0 ? "Cift sayi" : "Cift sayi degil"
                    :
                    sayi < -99 && sayi > -1000 ? "Uc basamakli" : "Uc basamakli degil";

            String var10000;
            if (sayi > 0) {
                var10000 = sayi % 2 == 0 ? "Cift sayi" : "Cift sayi degil";
            } else if (sayi < -99 && sayi > -1000) {
                var10000 = "Uc basamakli";
            } else {
                var10000 = "Uc basamakli degil";
            }
    }
}

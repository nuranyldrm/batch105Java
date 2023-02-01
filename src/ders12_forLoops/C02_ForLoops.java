package ders12_forLoops;

public class C02_ForLoops {

    public static void main(String[] args) {
        //// for (baslangıc; durum ;arttırma) {// kodlar }


        int i;
        for(i = 1; i <= 10; ++i) {
            System.out.print("" + i + " ");
        }
//    2 basamaklı sayılardan 7 ile bölünebilenleri yanyana yazın
        System.out.println(""); // alt satıra gecmesi ıcın bunu eklıyoruz

        for(i = 10; i < 100; ++i) {
            if (i % 7 == 0) {
                System.out.print("" + i + " ");
            }
        }

        System.out.println("");

        // 13 den baslayıp 7 ser artırıp yazdırın 100 e kadar

        for(i = 13; i <= 100; i += 7) {
            System.out.print("" + i + " ");
        }

        System.out.println("");
        // 1 den 10 a kadar (sınırlar dahil) sayıların karelerını yazdırın

        for(i = 1; i <= 10; ++i) {
            System.out.print(i * i + " ");
        }

    }
}


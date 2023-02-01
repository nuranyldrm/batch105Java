package ders08_Ternary;

import java.util.Scanner;

public class C00_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        // kullaıcıdan yazdıgı saynın ıkı katını yazdırın

        if (sayi>0){
            System.out.println(sayi*2);
        }else{
            System.out.println(sayi+10);
        }

        // ternery ıle yazdırırsak
        System.out.println(sayi>0 ? 2*sayi : sayi+10);
                          // sart - sart true ise işlem yoksa false ise diger ıslem
                           // sayi 0 dan buyuk mu ?
                            //0 dab büyükse 2* katıyla carpıcak
                            //0 dan buyuk degilse +10 ekleyecek
                           // : iki nokta ustuste degilse demektir//

        int a = 10;
        System.out.println(a>10 ? "girilen sayı pozıtıftır" : 0+10);
        //  ternery ifadenın sonucu bir veriable atama yapılacaksa sart saglanrsa
        // veya saglanmazsa elde edılecek sayı aynı data turunde olmalıdır
        int b=14;
        //  b= b>0 ?"girilen sayi pozitiftir": a+10;  böyle olursa yazı kısmı kırmızı cızılır hata verir
        b= b>0? b*2 : b+10;



    }
}

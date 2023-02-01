package ders08_Ternary;

import java.util.Scanner;

public class C01_Teerny {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
          kucukse “Maalesef kaldin” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen not'u giriniz");
        int not= scan.nextInt();

        System.out.println (not >=50?"sınıfı gectin":"malesef kaldın");
    }
}

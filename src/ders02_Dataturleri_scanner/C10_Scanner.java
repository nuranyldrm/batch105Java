package ders02_Dataturleri_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        //Bu örnekte yarıçapı kullanıcıdan alınan dairenin alanını hesaplayacağız.
        //Dairenin alanı = π x r²

        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int yarıcap = scan.nextInt();

        System.out.println("Dairenin alanı = " + (Math.PI * yarıcap * yarıcap));
    }
}

package ders15_OverLoading_WhileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // 2 basamaklı sayıları aralarında  bir bosluk olacak sekılde yanyana yazdırın

        int a;
        for(a = 10; a <= 99; ++a) {
            System.out.print("" + a + " ");
        }

        System.out.println("");

        for(a = 10; a < 100; ++a) {
            System.out.print("" + a + " ");
        }
        // bunu while loop ile böyle yaaprız
        int b=10;
        while (b>100){
            System.out.print(a+" ");
            a++;
        }

    }
}

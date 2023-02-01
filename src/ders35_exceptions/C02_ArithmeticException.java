package ders35_exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 0;

        try {
            System.out.println(sayi1 / sayi2);
            System.out.println("Bakalim bu satir calisacak mi ?");
        } catch (ArithmeticException var4) {
            System.out.println("Sayi sifira bolunemez");
        }

    }
}



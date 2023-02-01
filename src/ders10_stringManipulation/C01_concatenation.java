package ders10_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Guzeldir";
        boolean bl = true;
        int sayi = 20;
        double dbl = 3.54;
        System.out.println(str1 + bl + sayi);

       //
        // System.out.println(bl+ sayi);
        // string dısındaki data turlerinde toplama yapmamıza izin vermeyebilir
        System.out.println((double)sayi + dbl);

        System.out.println(sayi+dbl);// 23.54

        //System.out.println(str1.concat(bl));
        //concat() sadece string veriable lari birleştirmek için kullanılır
        // stringleri arka arkaya concat kabul eder fakat stringden sonra diger veriablları kanul etmez

        System.out.println(str1.concat(" ").concat(str2));
    }
}

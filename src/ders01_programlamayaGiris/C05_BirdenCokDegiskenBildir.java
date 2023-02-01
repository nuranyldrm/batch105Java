package ders01_programlamayaGiris;

public class C05_BirdenCokDegiskenBildir {
    public static void main(String[] args) {
        int x=5;
        int y=8;
        int z=52;
        System.out.println(x+y+z);
        System.out.println(x*y);
        System.out.println(z/y);

        int a=9, b=4, c=47; // virgulle ayırarak yazma
        System.out.println(a+b+c);
        Math.incrementExact(a);

        // aynı degeri birden cok degiskene atama
        int d,e,f;
        d=e=f=50;
        System.out.println(d+e+f);


    }
}

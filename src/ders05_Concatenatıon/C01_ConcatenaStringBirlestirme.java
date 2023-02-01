package ders05_Concatenatıon;

public class C01_ConcatenaStringBirlestirme {
    public static void main(String[] args) {
        // sadece asagıda verilen veriable ları kullanarak istenen degerleri yazdıralım

        String s1="java";
        String s2="Guzeldir";
        String s3=""; //hiclik
        String s4=" "; // space bosluk

        int sayi1= 4;
        int sayi2= 3;

        //34 java
        System.out.println(s3+sayi2+sayi1+s4+s1);
        System.out.println(sayi2+s3+sayi1+s4+s1);
        // 34 java 3-4 u toplamadan yanyana yazdırmak icin striglestırıyoruz basına koyarak s3 gıbı

        //Java7 güzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s3+s2+sayi1+sayi2);


        //  7 Java Guzeldir
        System.out.println(sayi1+sayi2+s1+s4+s2);
        // java Guzeldir7
        System.out.println(s1+s4+s2+(sayi1+sayi2)); // java Guzeldir7


        // java guzeldir 12
        System.out.println(s1+s4+s2+s4+sayi1+sayi2); // sayilerı parantez içine alsakta 12 cıkar java guzeldir 12


        String e= "Hello";
        String d= "World";
        System.out.println(e+d);  //HelloWorld
        System.out.println(e+" "+d);  //Hello World

        String a="Hello";
        int b=2;
        int c=3;
        System.out.println(a+b+c);  //Hello23
        System.out.println(c+b+a);   //5Hello
        System.out.println(a+(b+c));  //Hello5
        System.out.println(a+b*c);   //Hello6

    }
}

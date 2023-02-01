package ders04_matematikselİslemler;

public class C08_Pre_Post_Incement {
    public static void main(String[] args) {
        int x=3;
        int y =2* ++x;
        int z=5 + y-- ;
        System.out.println(x+y+z);

        int a=10;
        int b=a++; // post increment
        // önce b ye atama yapar (b=10),
        // sonra a degerini artırır(a=11),
        System.out.println(a);
        System.out.println(b);

        int c= 15;
        int d = ++a; // pre ıncrement
        System.out.println(c);
        System.out.println(d);
        // önce artırma yapar (a=11)
        // sonra b ye atama yapar (b=11)

        int e=12;
        System.out.println("a'nin degeri:" + ++e);
        int g= e++;
        System.out.println("b'nin degeri:"+g);
        int s= g++ + e;
        System.out.println("c'nin degeri:" + s);
        System.out.println("Son toplam:"+ (e+g+s));
    }
}

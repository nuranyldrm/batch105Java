package ders15_OverLoading_WhileLoop;

public class C02_OverLoading {
    public static void main(String[] args) {
        carpim(3,5);
        carpim(3.4,2);
    }
    /*
    method call sırasında method parantezine yazılanlara argument denir
    bir clas da aynı isim ve aynı signature ait sahip iki method olmaz

    method overloading olan class larda java hangi method un calısacagına su sekılde karar verir
    1- önce method ismine bakar
    2-argument sayisi ile parametre sayisina bakar
    3-argument ve parametre uyumuna bakar
    4- minimum casting (veriable genıslemesı-kesmesı)
     */
    public static void carpim(int sayi1 , int sayi2 ){ // carpim (int int)******
        System.out.println("iki integer sayinin carpimi:"+  sayi1*sayi2);
    }
    public static void carpim(int sayi1 , int sayi2 , int sayi3){ // carpim(int int int );******
        System.out.println("üc integer sayinin carpimi:"+  sayi1*sayi2);
    }
    public static void carpim(double sayi1 , int sayi2 ){ // carpim  double int ******
        System.out.println("double -integer iki sayinin carpimi:"+  sayi1*sayi2);
    }
    public static void carpim(int sayi1 , double sayi2 ){ // carpim int double ******
        System.out.println("integer-double sayinin carpimi:"+  sayi1*sayi2);
    }
    public static void carpim(double sayi1 , double sayi2 ){ // carpim double double ******
        System.out.println("double iki sayinin carpimi:"+  sayi1*sayi2);
    }




}

package ders17_scope;

public class C04_ClassVariables {
    // c03 deki hastane ismini yazdırmak istersek

    public static void main(String[] args) {
        System.out.println(C03_ObjectVariables.hastaneismi);
        System.out.println(C03_ObjectVariables.hastaSayisi);
        ++C03_ObjectVariables.hastaSayisi; // hasta sayısını bir arttırma alttakıde aynı
        C03_ObjectVariables.hastaSayisi++;
        method1();
        System.out.println(C03_ObjectVariables.hastaSayisi);
    }
    // kod takibi main methoddan baslar
    // main method un sonuna geldiginde hersey biter
    // tum degisimler resetlenir
    // veriable degerleri bastaki hallerine döner

    public static void method1() {
        ++C03_ObjectVariables.hastaSayisi;
    }

    /*
    java runtime programdır
    calısmaya basladıgında veriablelara atanan degerleri isler
    calsıtıgı muddetce yapılan degisiklikleri kaydeder
    ama calısması bittiginde degisen degerler resetlenir
     */
}


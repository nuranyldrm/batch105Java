package ders23_constructors;

public class DArabaRunner {
    public DArabaRunner() {
    }

    public static void main(String[] args) {
        DAraba arb1 = new DAraba();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        arb1.marka = "Tofas";
        arb1.model = "Kartal";
        arb1.yakit = "Benzin";
        arb1.yil = 1991;
        arb1.fiyat = 50000;
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.maxHiz(arb1.yakit));
        DAraba arb2 = new DAraba();
        System.out.println("Marka : " + arb2.marka + "\nModel : " + arb2.model + "\nYakit : " + arb2.yakit + "\nYil : " + arb2.yil + "\nFiyat : " + arb2.fiyat);
        DAraba arb3 = new DAraba();
        System.out.println(arb3);
        System.out.println(arb1);
        DAraba arb4 = new DAraba();
        System.out.println(arb4);
    }
}



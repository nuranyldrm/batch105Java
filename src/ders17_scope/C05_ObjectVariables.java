package ders17_scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        // C03 class ın daki instance veriablelara nasıl ulasabiliriz?
        // instance veriablar in diger ad obje veriable dir
        // instance veriable lara obje uzerındden ulasabliriz
        C03_ObjectVariables pers1 = new C03_ObjectVariables();
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        pers1.persIsmi = "Suleyman";
        pers1.persYasi = 35;
        pers1.persTelefonu = "555.3456754";
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);

        C03_ObjectVariables pers2 = new C03_ObjectVariables();
        pers2.persIsmi = "Latife";
        pers2.persYasi = 32;
        pers2.persTelefonu = "555 4322321";
        System.out.println(pers1.persIsmi);
        System.out.println(pers2.persIsmi);

        C03_ObjectVariables pers3 = new C03_ObjectVariables();
        pers3.persIsmi = "Heysem";
        pers3.persYasi = 30;
        pers3.persTelefonu = "312 2134567";
        System.out.println(pers1.persYasi);
        System.out.println(pers2.persYasi);
        System.out.println(pers3.persYasi);
    }
}


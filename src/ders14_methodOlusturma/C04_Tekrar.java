package ders14_methodOlusturma;

public class C04_Tekrar {

    public static void main(String[] args) {
        // bu 2 sayının carpım sonucunu yenı kod yazmadan konsola yazdırın
        int a = 10;
        int b = 20;
        System.out.println(C01_Carpim.carpimMethodu((double)a, (double)b));
        String c = "Nasil";
        String d = "yani?";
        // 2 stringi aralarında bosluk bırakarak yazdırın
        System.out.println(C02_StringConcate.birlestirMethodu(c, d));

        String e = "Bu da mi oldu?";
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e));// e stringini tersten yazdırın
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("Bu cumleyi terse cevirin"));
        String str = "Java cok guzel";
        System.out.println(str.toUpperCase());
    }
}


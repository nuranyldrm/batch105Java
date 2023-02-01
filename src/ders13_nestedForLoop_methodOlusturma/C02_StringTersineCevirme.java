package ders13_nestedForLoop_methodOlusturma;

public class C02_StringTersineCevirme {

    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        String input = "Java her gecen gun guzellesıyor";
        String tersInput = "";

        for(int i = input.length() - 1; i >= 0; --i) {
            tersInput = tersInput + input.substring(i, i + 1);
        }

        System.out.println("Ters hali : " + tersInput);
    }
}

package ders14_methodOlusturma;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {

        // parametre olarak bir string kabul edip onu ters cevirilmis halıne donduren method yapın
        String input = "java kod yazdikca ogrenilir";
        System.out.println(stringiTerseCevir(input));
    }

    public static String stringiTerseCevir(String input) {
        String tersStr = "";

        for(int i = input.length() - 1; i >= 0; --i) {
            tersStr = tersStr + input.charAt(i);
        }

        return tersStr;
    }
}

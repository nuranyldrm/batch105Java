package ders15_OverLoading_WhileLoop;

public class C09_StringTerseCevirme {


    public C09_StringTerseCevirme() {

    }

    public static void main(String[] args) {
        String str = "Java Candir";
        String tersStr = stringiTersCevir(str);
        System.out.println(tersStr);
    }

    public static String stringiTersCevir(String str) {
        String tersStr = "";

        for (int index = str.length() - 1; index >= 0; --index) {
            tersStr = tersStr + str.substring(index, index + 1);
        }

        return tersStr;
    }
    }
package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {
        //str.repeat ( tekrarSayisi);
        //Bir String’i tekrarSayisi kadar tekrar ettirir

        String str = "java guzeldir\n"; // sonun slac n koyarsak alt alta atar
        System.out.println(str.repeat(4));

        str = "   Java guzeldir   ";
        System.out.println(str.length()); //19

        //str.trim ( );
        //Bir String’in basinda ve sonunda (varsa) bulunan space’leri siler.

        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());
    }
}


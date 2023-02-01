package ders01_programlamayaGiris;

public class C06_OzelKarakterler {
    public static void main(String[] args) {
        String txt="bugun hava \" gunesli\" cok guzel"; // iki tırnak icine alır
        System.out.println(txt);

        String alıntı="Ankara\' da guzeldir"; //ayrac koyar tek tırnak
        System.out.println(alıntı);

        String slac="no\\2";// tek slac koyar
        System.out.println(slac);

        String n="java kodluyorum\n basladım"; // alt satıra ıkıncı kısmı atar new line
        System.out.println(n);
        String r="java\r kodluyorum basladım"; // \r öncesini siler carriage return
        System.out.println(r);
        String t="java kodluyorum\t basladım";// bosluk burakır \t tab
        System.out.println(t);
        String b="java kodluyorum\b basladım";// koydugun harfı siler \b backspace
        System.out.println(b);
        String f="java kodluyorum\f basladım"; //karakter koyar \f from feed
        System.out.println(f);






    }
}

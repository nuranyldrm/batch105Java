package ders37_exceptions;

public class C02_ClassCastException {
    public C02_ClassCastException() {
    }

    public static void main(String[] args) {
       // short sayi1 = true;
        Short sayi3 = Short.valueOf((short)24);
        System.out.println("Short'dan obje'ye cast edince : " + sayi3);
        //Integer sayi5 = (Integer)sayi3;
        //System.out.println("Short datayi obje uzerinden Integer'a cevirince : " + sayi5);
    }
}

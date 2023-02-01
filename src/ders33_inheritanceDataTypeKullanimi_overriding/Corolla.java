package ders33_inheritanceDataTypeKullanimi_overriding;


    public class Corolla extends BToyota {
        String model = "Corolla";
        String uretimYeri = "Türkiye";
        int yil = 2023;

        public Corolla() {
        }

        public static void main(String[] args) {
            ders33_inheritanceDataTypeKullanimi_overriding.Corolla corolla1 = new ders33_inheritanceDataTypeKullanimi_overriding.Corolla();
            System.out.println(corolla1.model);
            System.out.println(corolla1.uretimYeri);
            System.out.println(corolla1.yil);
            System.out.println(corolla1.marka);
            System.out.println(corolla1.motor);
            System.out.println(corolla1.plaka);
            System.out.println(corolla1.yakit);
            BToyota corolla2 = new ders33_inheritanceDataTypeKullanimi_overriding.Corolla();
            System.out.println(corolla2.model);
            System.out.println(corolla2.yil);
            System.out.println(corolla2.marka);
            System.out.println(corolla2.motor);
            System.out.println(corolla2.plaka);
            System.out.println(corolla2.yakit);
            Araba corolla3 = new ders33_inheritanceDataTypeKullanimi_overriding.Corolla();
            System.out.println(corolla3.motor);
            System.out.println(corolla3.plaka);
            System.out.println(corolla3.yakit);
            BToyota toyota1 = new BToyota();
            System.out.println(toyota1.marka);
            System.out.println(toyota1.model);
            System.out.println(toyota1.motor);
            System.out.println(toyota1.plaka);
            System.out.println(toyota1.yil);
            System.out.println(toyota1.yakit);
            Araba toyota2 = new BToyota();
            System.out.println(toyota2.motor);
            System.out.println(toyota2.plaka);
            System.out.println(toyota2.yakit);
            Araba araba = new Araba();
            System.out.println(araba.motor);
            System.out.println(araba.plaka);
            System.out.println(araba.yakit);
        }
    }


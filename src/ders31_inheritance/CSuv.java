package ders31_inheritance;


    public class CSuv extends BinekArac {
        public CSuv() {
        }

        public static void main(String[] args) {
            ders31_inheritance.CSuv suv1 = new ders31_inheritance.CSuv();
            System.out.println(suv1.marka);
            System.out.println(suv1.model);
            System.out.println(suv1.motor);
            System.out.println(suv1.plaka);
            System.out.println(suv1.yakit);
            System.out.println(suv1.yil);
            suv1.hiz("benzin");
            suv1.teker();
            ders31_inheritance.CSuv suv2 = new ders31_inheritance.CSuv();
            suv2.marka = "Toyota";
            suv2.model = "Rav4";
            suv2.motor = "1.6";
            suv2.plaka = "06 ANK 006";
            suv2.yakit = "Benzin";
            suv2.yil = 2012;
            suv2.hiz(suv2.yakit);
        }

        public void hiz(String yakit) {
            if (yakit.equalsIgnoreCase("benzin")) {
                System.out.println("Benzinli SUV'ler max 300 km hiz yapar");
            } else if (yakit.equalsIgnoreCase("Dizel")) {
                System.out.println("Dizel SUV'ler max 260 km hiz yapar");
            } else if (yakit.equalsIgnoreCase("hibrit")) {
                System.out.println("Hibrit SUV'ler max 220 km hiz yapar");
            } else {
                System.out.println("yakit belli degil, max hiz soyleyemem");
            }

        }
    }




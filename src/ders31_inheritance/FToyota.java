package ders31_inheritance;


    public class FToyota extends EAraba {
        protected String marka = "Toyata";
        protected String motor = "Toyota araclar cevreci motor kullanir";
        protected String uretimYeri = "Uretim yeri belirtilmemis";
        protected int hiz = 140;

        FToyota() {
            System.out.println("Toyota cons. calisti");
        }
    }



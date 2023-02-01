package ders18_arrays;

public class C07_EnKisa_EnUzunKelime {
    public static void main(String[] args) {
        //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] arr = new String[]{"Hasan", "Ilker", "Senturk", "Omer Faruk"};
        enUzunEnKisaIsimleriYazdir(arr);
    }

    public static void enUzunEnKisaIsimleriYazdir(String[] arr) {
        String enuzunKelime = arr[0];
        String enKisaKelime = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i].length() >= enuzunKelime.length()) { //estlik durumunda eşit esittir isaretini koyarız ıkıncısını alır
                enuzunKelime = arr[i];
            }

            if (arr[i].length() <= enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }
        }

        System.out.println("En uzun isim : " + enuzunKelime);
        System.out.println("En kisa isim : " + enKisaKelime);
    }
}

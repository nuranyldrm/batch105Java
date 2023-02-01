package ders10_stringManipulation;

public class C09_Soru {

    public static void main(String[] args) {
        //kullanıcıdan bir cümle ve bir metin alın
        // cumle metninin durumuna göre
        //1-cümle metni icermiyor
        //2- cümle metni sadece 1 kere iceriyor
        //3- cümle metni birden fazla iceriyor
        //seceneklerinden uygun olanı yazdırın

        String cumle = "Java cok guzeldir cok.";
        String metin = "cok";
        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);
        if (ilkIndex == -1) {
            System.out.println("cumle metni icermiyor");
        } else if (ilkIndex == sonIndex) {
            System.out.println("cumle metni sadece 1 kere iceriyor");
        } else {
            System.out.println("cumle metni birden fazla iceriyor");
        }

    }
}


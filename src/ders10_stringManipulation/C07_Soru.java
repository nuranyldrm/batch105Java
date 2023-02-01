package ders10_stringManipulation;

public class C07_Soru {

    public static void main(String[] args) {

        //kullanıcıdan bir cümle ve bir metin alın
        // cumle metninin durumuna göre
        //1-cümle metni icermiyor
        //2- cümle metni sadece 1 kere iceriyor
        //3- cümle metni birden fazla iceriyor
        //seceneklerinden uygun olanı yazdırın

        String cumle = "Java cok guzeldir cok.";
        String metin = "cok";
        if (!cumle.contains(metin)) {
            System.out.println("cumle metni icermiyor");
        } else {
            int ilkIndex = cumle.indexOf(metin);
            int ikinciIndex = cumle.indexOf(metin, ilkIndex + 1);
            if (ikinciIndex == -1) {
                System.out.println("cumle metni sadece 1 kere iceriyor");
            } else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }

    }
}

package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {


    public static void main(String[] args) {
       // For Loop, belirli sayıda çalıştırılması gereken bir döngüyü verimli bir şekilde
        //yazmanıza olanak tanıyan bir tekrar kontrol yapısıdır
        //1-5 arasındakı sayılar için carpım tablosu olusturalım


        // dıs dongu satırları kontrol eder
        for(int i = 1; i <= 5; ++i) {
            // iç dongu her sutun satırda alan degeri kontrol eder
            for(int j = 1; j <= 5; ++j) {
                System.out.print(i * j + " ");
            }
            // ic döngü bittiginde java yı alt satıra indirmeliyiz
            System.out.println("");
        }

    }
}

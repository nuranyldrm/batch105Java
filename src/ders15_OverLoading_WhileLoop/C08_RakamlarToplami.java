package ders15_OverLoading_WhileLoop;
public class C08_RakamlarToplami {
    public static void main(String[] args) {
        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
        int sayi=1453;
        int birlerBasamagi=0;
        int rakamlarToplam─▒=0;

        while (sayi!=0){
            birlerBasamagi=sayi%10;
            rakamlarToplam─▒ +=birlerBasamagi;
            sayi/=10;
        }
        System.out.println(rakamlarToplam─▒);
    }



}

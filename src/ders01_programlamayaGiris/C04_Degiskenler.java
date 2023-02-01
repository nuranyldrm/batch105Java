package ders01_programlamayaGiris;

public class C04_Degiskenler {
    public static void main(String[] args) {
        // diger turdeki  degiskenlerin nasıl bildirilecegının gösterimi
        int myNum=5;
        float myFloatNum=5.99f;
        char myLetter='D';
        boolean myBool=true;
        String myText="Hello";

        // degiskenleri birlestirmek icin artı + ısareti kullanılır
        String firstName="Nuran";
        String lastName="yildirim";
        String fullName=firstName+lastName;
        System.out.println(fullName);
        String fullName1=(firstName+"  "+lastName); // arasında bosluk bırakarak yazdırmak ıcın
        System.out.println(fullName1);
    }
}

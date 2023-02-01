package ders04_matematikselİslemler;

import java.util.Scanner;

public class C04_RakamlarToplamı {
    public static void main(String[] args) {

        //kullanıcının girdigi 4 basamaklı bır sayının
        //rakamları toplamını veren bir kod yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen4 basamaklı bir sayi giriniz");
        int input= scan.nextInt();

       // int input=1453;  testır olarak kendimiz bir veri girdigimizde bu sekılde olacak scannerı yazmayacagız

        int birlerBasamagı=0;
        int rakamlarToplamı=0;

        // 1- birler basamagını al
        birlerBasamagı= input % 10;   //3

        //2- birler basamagını rakamlar toplamına ekle
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı;   //3

        // birler basamagından kurtul
        input=input/10;

        //kac basamakı ise sayı o kadar kopayala yapıstır
        // bu dızını bu1453 4 basamaklı oldugu ıcın dört defa yapıyoruz

        birlerBasamagı= input % 10;   //3
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı;   //3
        input=input/10;

        birlerBasamagı= input % 10;   //3
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı;   //3
        input=input/10;

        birlerBasamagı= input % 10;   //3
        rakamlarToplamı= rakamlarToplamı+birlerBasamagı;   //3
        input=input/10;


        System.out.println("Verilen sayinin rakamlar toplamı:"+rakamlarToplamı);



    }
}

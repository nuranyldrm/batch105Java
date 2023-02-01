package ders12_forLoops;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {
        // asal sayı bulma

        Scanner scan=new Scanner(System.in);
        int input;
        boolean asal=false;

        do {
            System.out.println("lütfen pozitif bir tam sayi giriniz");
            input = scan.nextInt();

        }   while (input<2);
        for (int i = 2; i <= input-1; i++) {
            if (input % i==0){
                asal=true;
                break;
            }
            System.out.println(asal);
            if (asal){
                System.out.print("girilen sayi asal degildir:"+ input );
            }else {
                System.out.println("girilen sayi :"+ input + "asaldır");
            }

        }

        }
    }


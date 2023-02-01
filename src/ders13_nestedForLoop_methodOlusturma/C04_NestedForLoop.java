package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {

    public static void main(String[] args) {
          //asagıdakı seklı yazdıran bir kod yazdırın
        /*

         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *


         */

        for(int i = 1; i <= 4; ++i) {
            for(int j = 1; j <= 6; ++j) {
                System.out.print("* ");
            }

            System.out.println(""); // iç loop bitince alt satıra gec
        }

    }
}

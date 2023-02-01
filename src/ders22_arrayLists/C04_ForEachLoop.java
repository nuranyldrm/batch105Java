package ders22_arrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 8, 4, 2, 6, 9, 6, 4, 5};
        // bu array deki5 den buyuk olanları toplayalım
        int toplam = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > 5) {
                toplam += arr[i];
            }
        }

        System.out.println("for loop ile : " + toplam);
        // for each ile daha basit bir kurgı ile calısır
        // fot each loop da 3 seyi soylememız lazım
        //1 hangi dATAturunde degiskenlerle ugrasacaksınız
        //loop icerisinde herhangi bir eleman geldisginde hangi islem yapacaksınız
        //hangi array veya collectıon dan elemanlar gelecek
        toplam = 0;
        int[] var7 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {  // array e gir herbir elemanı getir
            int each = var7[var5];
            if (each > 5) {
                toplam += each;
//                yada bu sekılde yapılabılır
//                for (int each:arr ) { //("arr ye git her bir elemanı bana getir")
//                }
//                if (each > 5) {
//                    toplam += each;
            }
        }

        System.out.println("for-each loop ile toplam : " + toplam);
    }
}



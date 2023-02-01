package ders20_multiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {
        // verilen 2 katlı bir integer array deki çift sayı adedını bulan bır kod yazın

        int[][] arr = new int[][]{{4, 6}, {3, 5, 8}, {1, 0, 4}};
        int sayac = 0;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] % 2 == 0) {
                    sayac++;
                }
            }
        }

        System.out.println("Array'deki cif sayi adedi : " + sayac);
    }
}




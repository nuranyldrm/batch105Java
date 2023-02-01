package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]


        int[][] arr = new int[][]{{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int[] output = new int[arr.length];
        int innerArrToplami = 0;

        for(int i = 0; i < arr.length; ++i) { // outer array içindeki inner arrayleri kontrol eder


            for(int j = 0; j < arr[i].length; ++j) { //her bir inner array in tüm elementlerini kontrol eder
                innerArrToplami += arr[i][j];
            }

            output[i] = innerArrToplami;
        }

        System.out.println(Arrays.toString(output));
    }
}

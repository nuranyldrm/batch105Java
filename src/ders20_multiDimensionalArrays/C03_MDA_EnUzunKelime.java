package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelime {

    public static void main(String[] args) {
        // verilen MDA  bir arry da en uzunn stringi bulan kod yazın
        String[][] arr = new String[][]{{"Ilker", "Nesrin"}, {"Hasan", "Heysem", "Adem", "Yusuf Enes"}};
        String enUzunKelime = arr[0][0];

        for(int i = 0; i < arr.length; ++i) { // outer elemanlarını kontrol eder
            for(int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j].length() > enUzunKelime.length()) {
                    enUzunKelime = arr[i][j];
                }
            }
        }

        System.out.println("En uzun kelime : " + enUzunKelime);
    }
}


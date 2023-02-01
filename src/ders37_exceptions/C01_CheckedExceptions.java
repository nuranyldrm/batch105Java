package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public C01_CheckedExceptions() {
    }

    public static void main(String[] args) {

        String dosyaYolu = "src/ders36_checkedExceptions/Deneme.txt";
         boolean k = false; // int dı boolean a cevrdim

       /* try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            int k ;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException var4) {
            System.out.println("Dosya yolu yanlis veya dosya arizali");
        } catch (IOException var5) {
            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");
        }*/

    }

  }
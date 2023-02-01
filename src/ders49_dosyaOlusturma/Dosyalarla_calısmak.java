package ders49_dosyaOlusturma;

import java.io.*;
import java.util.Scanner;

public class Dosyalarla_calısmak {
    public static void main(String[] args) {
      readFile();
      writeFile();
      readFile();
        }
        public static void createFile(){
            File file = new File("C:\\Users\\monster\\Desktop\\My Desktop\\course\\Java\\batch105Java\\src\\files\\students.txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("Dosya Olusturuldu.");
                } else {
                    System.out.println("Dosya zaten mevcut");
                }

            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        public static void getFileInfo(){
            File file = new File("C:\\Users\\monster\\Desktop\\My Desktop\\course\\Java\\batch105Java\\src\\files\\students.txt");
            if(file.exists()){
                System.out.println("Dosya adı: "+ file.getName());
                System.out.println("Dosya yolu: "+ file.getAbsolutePath());
                System.out.println("Dosya yazılabilir mi: "+ file.canWrite());
                System.out.println("Dosya okunabilirmi mi: "+ file.canRead());
                System.out.println("Dosya boyutu ne : "+ file.length());
            }
        }

        public static void readFile(){
            File file = new File("C:\\Users\\monster\\Desktop\\My Desktop\\course\\Java\\batch105Java\\src\\files\\students.txt");
            try {
                Scanner reader=new Scanner(file);
                while (reader.hasNextLine()){
                    String line=reader.nextLine();
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


        }
        public static void writeFile(){
            try {
                BufferedWriter writer= new BufferedWriter(new FileWriter("C:\\Users\\monster\\Desktop\\My Desktop\\course\\Java\\batch105Java\\src\\files\\students.txt",true));
                // sonuna true yazmas ısek uzerine yazar ve diger yazılanlar gider o yuzden eklemesı iin bu sekılde yazıyoruz
                writer.newLine();// alt satıra gecıp yazmasını saglar bu olmazsa son yazıya birleşik yazılır
                writer.write("Ahmet");
                System.out.println("Dosya yazıldı");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
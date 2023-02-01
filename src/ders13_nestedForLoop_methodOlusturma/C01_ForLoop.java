package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {

    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve String’i tersten yazdirin
        // burada atama yapmadık o yuzden kalıcı olmadı dıger örnekte c02 de kalıcı yaptık ters ınput ıle atama yaparak

        String input = "Java ne kadar guzel";

        for(int i = input.length() - 1; i >= 0; --i) {
            System.out.print(input.charAt(i));

        }
        String str="Nuran";
        for (int i = str.length()-1; i >=0 ; --i) {
            System.out.print("  "+ str.charAt(i));

        }

    }
}

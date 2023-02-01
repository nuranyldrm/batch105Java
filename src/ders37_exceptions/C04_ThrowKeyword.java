package ders37_exceptions;

public class C04_ThrowKeyword {
    public C04_ThrowKeyword() {
    }

    public static void main(String[] args) {
        String a = null;
        String b = "";

        try {
            int c = ((String)a).length() + b.length();
            throw new RuntimeException();
        } catch (NullPointerException var4) {
            System.out.println("null pointer'dir, uzunlugu olmaz");
        } catch (RuntimeException var5) {
            System.out.println("throw keyword");
        }

    }
}



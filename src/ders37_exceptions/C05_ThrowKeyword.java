package ders37_exceptions;

public class C05_ThrowKeyword {
    public C05_ThrowKeyword() {
    }

    public static void main(String[] args) {
        String a = null;
        String b = "";

        try {
            try {
                int var3 = ((String)a).length() + b.length();
            } catch (NullPointerException var4) {
                if (b.length() == 0) {
                    throw new RuntimeException();
                }

                System.out.println("null pointer'dir, uzunlugu olmaz");
            }
        } catch (RuntimeException var5) {
            System.out.println("throw keyword");
        }

    }
}


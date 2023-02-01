package ders37_exceptions;

public class C07_Trycatch {
    public C07_Trycatch() {
    }

    public static void main(String[] args) {
        try {
            çalış();
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
        }

    }

    private static void çalış() {
        çalış();
        throw new RuntimeException("Çoook çalış");
    }
}



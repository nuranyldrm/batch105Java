package ders28_varargs_stringBuilder;

public class C06_StringBuilder {
    public C06_StringBuilder() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Guzeldir");
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.indexOf("a", 2));
    }
}


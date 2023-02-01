package ders28_varargs_stringBuilder;

public class C05_StringBuilder {
    public C05_StringBuilder() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java candir.");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.reverse();
        sb.replace(0, 4, "Ahmet hoca");
        System.out.println(sb);
        sb.insert(18, "Bu bir yalandir");
        System.out.println(sb);
        String str = "Java cok guzel";
        sb.insert(21, str, 9, 14);
        System.out.println(sb);
    }
}



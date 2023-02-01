package ders28_varargs_stringBuilder;

public class C04_StringBuilder {
    public C04_StringBuilder() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(7);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" guzeldir.");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" ona ne suphe");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}


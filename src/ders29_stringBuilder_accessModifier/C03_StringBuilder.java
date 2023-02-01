package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {
    public C03_StringBuilder() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java ne kadar guzel");
        System.out.println(sb.substring(4));
        System.out.println(sb);
        System.out.println(sb.toString().contains("guzel"));
        sb.setCharAt(5, 'N');
        System.out.println(sb);
    }
}



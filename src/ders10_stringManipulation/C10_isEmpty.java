package ders10_stringManipulation;

public class C10_isEmpty {

    public static void main(String[] args) {
        //Verilen bir String’in bos olup olmadigini boolean olarak döndürür. dolumu bosmu ona bakar

        String str = "";
        System.out.println(str.isEmpty()); // true
        str = "   ";
        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank()); // bırseyler yazsada bosluk mu ona bakar true

        str = "x";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}

package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a")); // 9- ilk kucuk a nın  bulundugu indexi getirir
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(99));
        System.out.println(str.indexOf("hersey")); // bu  bulok hangi indexten baslarsa onu döndurur 15 den baslıyor
        System.out.println(str.indexOf("e", 9)); // 9 dan sonra basla ve e yi ara demek  =13

        // 13. indexteki e den  sonraki e nin indexini bulalım
        System.out.println(str.indexOf("e", 14));//16

        //cümledeki ikinci c nin indexini yazdırın
        int ilkcindex = str.indexOf("c"); //8
        System.out.println(str.indexOf("c", ilkcindex + 1));

        System.out.println(str.indexOf("ali")); //index olarak int döndürmesi lazım
                                                 // olmayan ne aratırsak -1 döner
        System.out.println(str.indexOf("x"));
    }
}


package ders11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {
        //kullanıcının girdigi metinde harf dısında kalan tüm karakterleri temizleyen bir kod yazın
        // not;space silinmemeli,
        String input = "9%H2av*(a  co_k 1*guzel";
        input = input.replaceAll("\\d", "");
        input = input.replace(" ", "5");
        input = input.replaceAll("\\W", "");
        input = input.replace("_", "");
        input = input.replace("5", " ");
        input = input.replaceAll("\\s+", " "); // birden fazla bosluk olan yerlere bir bosluk yapma
        System.out.println(input);

         //ahmetbulutluoz java ders 11 videosu
    }
}

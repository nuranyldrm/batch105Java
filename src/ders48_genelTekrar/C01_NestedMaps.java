package ders48_genelTekrar;


import java.util.HashMap;
import java.util.Map;

public class C01_NestedMaps {
    public C01_NestedMaps() {
    }

    public static void main(String[] args) {
        Map<String, Object> bookingdatesMap = new HashMap();
        bookingdatesMap.put("checkin", "2021-06-01");
        bookingdatesMap.put("checkout", "2021-06-10");
        Map<String, Object> requestBodyMap = new HashMap();
        requestBodyMap.put("firstname", "Ahmet");
        requestBodyMap.put("lastname", "Bulut");
        requestBodyMap.put("totalprice", 500);
        requestBodyMap.put("depositpaid", false);
        requestBodyMap.put("bookingdates", bookingdatesMap);
        requestBodyMap.put("additionalneeds", "wi-fi");
        System.out.println(requestBodyMap.get("bookingdates"));
        System.out.println(((Map)requestBodyMap.get("bookingdates")).get("checkin"));
    }
}
